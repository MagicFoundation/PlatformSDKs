# Copyright (C) 2009 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# Common definitions for the Android NDK build system
#

# We use the GNU Make Standard Library
include $(NDK_ROOT)/build/gmsl/gmsl

include $(BUILD_SYSTEM)/definitions-tests.mk
include $(BUILD_SYSTEM)/definitions-utils.mk
include $(BUILD_SYSTEM)/definitions-host.mk
include $(BUILD_SYSTEM)/definitions-graph.mk

include $(BUILD_SYSTEM)/version.mk

ndk-major-at-least = $(if $(filter $(true),$(call gte,$(NDK_MAJOR),$1)),true,false)

# -----------------------------------------------------------------------------
# Macro    : this-makefile
# Returns  : the name of the current Makefile in the inclusion stack
# Usage    : $(this-makefile)
# -----------------------------------------------------------------------------
this-makefile = $(lastword $(MAKEFILE_LIST))

# -----------------------------------------------------------------------------
# Macro    : local-makefile
# Returns  : the name of the last parsed Android.mk file
# Usage    : $(local-makefile)
# -----------------------------------------------------------------------------
_last_android_mk = $(lastword $(filter %Android.mk,$(MAKEFILE_LIST)))
_last_non_ndk_makefile = $(lastword $(filter-out $(NDK_ROOT)%,$(MAKEFILE_LIST)))
local-makefile = $(if $(_last_android_mk),$(_last_android_mk),$(_last_non_ndk_makefile))

# -----------------------------------------------------------------------------
# Function : assert-defined
# Arguments: 1: list of variable names
# Returns  : None
# Usage    : $(call assert-defined, VAR1 VAR2 VAR3...)
# Rationale: Checks that all variables listed in $1 are defined, or abort the
#            build
# -----------------------------------------------------------------------------
assert-defined = $(foreach __varname,$(strip $1),\
  $(if $(strip $($(__varname))),,\
    $(call __ndk_error, Assertion failure: $(__varname) is not defined)\
  )\
)

# -----------------------------------------------------------------------------
# Function : check-required-vars
# Arguments: 1: list of variable names
#            2: file where the variable(s) should be defined
# Returns  : None
# Usage    : $(call check-required-vars, VAR1 VAR2 VAR3..., <file>)
# Rationale: Checks that all required vars listed in $1 were defined by $2
#            or abort the build with an error
# -----------------------------------------------------------------------------
check-required-vars = $(foreach __varname,$1,\
  $(if $(strip $($(__varname))),,\
    $(call __ndk_info, Required variable $(__varname) is not defined by $2)\
    $(call __ndk_error,Aborting)\
  )\
)

# The list of default C++ extensions supported by GCC.
default-c++-extensions := .cc .cp .cxx .cpp .CPP .c++ .C

# -----------------------------------------------------------------------------
# Function : generate-empty-file
# Arguments: 1: file path
# Usage    : $(call generate-empty-file,<path>)
# Rationale: This function writes an empty file. Use this function as a
#            portable replacement for "touch" to update an empty timestamp
#            file.
# -----------------------------------------------------------------------------
generate-empty-file = $(HOST_ECHO_N) "" > $1

# -----------------------------------------------------------------------------
# Function : generate-dir
# Arguments: 1: directory path
# Returns  : Generate a rule, but not dependency, to create a directory with
#            host-mkdir.
# Usage    : $(call generate-dir,<path>)
# -----------------------------------------------------------------------------
define ev-generate-dir
__ndk_dir := $1
ifeq (,$$(__ndk_dir_flag__$$(__ndk_dir)))
# Note that the following doesn't work because path in windows may contain
# ':' if ndk-build is called inside jni/ directory when path is expanded
# to full-path, eg. C:/path/to/project/jni/
#
#    __ndk_dir_flag__$1 := true
#
__ndk_dir_flag__$$(__ndk_dir) := true
$1:
	@$$(call host-mkdir,$$@)
endif
endef

generate-dir = $(eval $(call ev-generate-dir,$1))

# -----------------------------------------------------------------------------
# Function : generate-file-dir
# Arguments: 1: file path
# Returns  : Generate a dependency and a rule to ensure that the parent
#            directory of the input file path will be created before it.
#            This is used to enforce a call to host-mkdir.
# Usage    : $(call generate-file-dir,<file>)
# Rationale: Many object files will be stored in the same output directory.
#            Introducing a dependency on the latter avoids calling mkdir -p
#            for every one of them.
#
# -----------------------------------------------------------------------------

define ev-generate-file-dir
__ndk_file_dir := $(call parent-dir,$1)
$$(call generate-dir,$$(__ndk_file_dir))
$1:| $$(__ndk_file_dir)
endef

generate-file-dir = $(eval $(call ev-generate-file-dir,$1))

# -----------------------------------------------------------------------------
# Function : generate-list-file
# Arguments: 1: list of strings (possibly very long)
#            2: file name
# Returns  : write the content of a possibly very long string list to a file.
#            this shall be used in commands and will work around limitations
#            of host command-line lengths.
# Usage    : $(call host-echo-to-file,<string-list>,<file>)
# Rationale: When there is a very large number of objects and/or libraries at
#            link time, the size of the command becomes too large for the
#            host system's maximum. Various tools however support the
#            @<listfile> syntax, where <listfile> is the path of a file
#            which content will be parsed as if they were options.
#
#            This function is used to generate such a list file from a long
#            list of strings in input.
#
# -----------------------------------------------------------------------------

define generate-list-file-ev

__list_file := $2

.PHONY: $$(__list_file).tmp

$$(call generate-file-dir,$$(__list_file).tmp)

$$(__list_file).tmp:
	$$(file >$$@,$1)

$$(__list_file): $$(__list_file).tmp
	$$(hide) $$(call host-copy-if-differ,$$@.tmp,$$@)
	$$(hide) $$(call host-rm,$$@.tmp)

endef

generate-list-file = $(eval $(call generate-list-file-ev,$1,$2))

# -----------------------------------------------------------------------------
# Function : link-whole-archives
# Arguments: 1: list of whole static libraries
# Returns  : linker flags to use the whole static libraries
# Usage    : $(call link-whole-archives,<libraries>)
# Rationale: This function is used to put the list of whole static libraries
#            inside a -Wl,--whole-archive ... -Wl,--no-whole-archive block.
#            If the list is empty, it returns an empty string.
#            This function also calls host-path to translate the library
#            paths.
# -----------------------------------------------------------------------------
link-whole-archives = $(if $(strip $1),$(call link-whole-archive-flags,$1))
link-whole-archive-flags = -Wl,--whole-archive $(call host-path,$1) -Wl,--no-whole-archive

-test-link-whole-archive = \
  $(call test-expect,,$(call link-whole-archives))\
  $(eval _start := -Wl,--whole-archive)\
  $(eval _end := -Wl,--no-whole-archive)\
  $(call test-expect,$(_start) foo $(_end),$(call link-whole-archives,foo))\
  $(call test-expect,$(_start) foo bar $(_end),$(call link-whole-archives,foo bar))

# =============================================================================
#
# Modules database
#
# The following declarations are used to manage the list of modules
# defined in application's Android.mk files.
#
# Technical note:
#    We use __ndk_modules to hold the list of all modules corresponding
#    to a given application.
#
#    For each module 'foo', __ndk_modules.foo.<field> is used
#    to store module-specific information.
#
#        type         -> type of module (e.g. 'static', 'shared', ...)
#        depends      -> list of other modules this module depends on
#
#    Also, LOCAL_XXXX values defined for a module are recorded in XXXX, e.g.:
#
#        PATH   -> recorded LOCAL_PATH for the module
#        CFLAGS -> recorded LOCAL_CFLAGS for the module
#        ...
#
#    Some of these are created by build scripts like BUILD_STATIC_LIBRARY:
#
#        MAKEFILE -> The Android.mk where the module is defined.
#        LDFLAGS  -> Final linker flags
#        OBJECTS  -> List of module objects
#        BUILT_MODULE -> location of module built file (e.g. obj/<app>/<abi>/libfoo.so)
#
#    Note that some modules are never installed (e.g. static libraries).
#
# =============================================================================

# The list of LOCAL_XXXX variables that are recorded for each module definition
# These are documented by docs/ANDROID-MK.TXT. Exception is LOCAL_MODULE
#
modules-LOCALS := \
    ALLOW_MISSING_PREBUILT \
    ALLOW_UNDEFINED_SYMBOLS \
    ALLOW_UNDEFINED_VERSION_SCRIPT_SYMBOLS \
    ARM_MODE \
    ARM_NEON \
    ASFLAGS \
    ASMFLAGS \
    BUILT_MODULE_NOT_COPIED \
    CFLAGS \
    CLANG_TIDY \
    CLANG_TIDY_FLAGS \
    CONLYFLAGS \
    CPPFLAGS \
    CPP_EXTENSION \
    CPP_FEATURES \
    CXXFLAGS \
    C_INCLUDES \
    DISABLE_FATAL_LINKER_WARNINGS \
    DISABLE_FORMAT_STRING_CHECKS \
    EXPORT_ASMFLAGS \
    EXPORT_CFLAGS \
    EXPORT_CONLYFLAGS \
    EXPORT_CPPFLAGS \
    EXPORT_C_INCLUDES \
    EXPORT_LDFLAGS \
    EXPORT_LDLIBS \
    EXPORT_SHARED_LIBRARIES \
    EXPORT_STATIC_LIBRARIES \
    FILTER_ASM \
    HAS_CPP \
    LDLIBS \
    MODULE \
    MODULE_FILENAME \
    PATH \
    PCH \
    SHARED_LIBRARIES \
    SHORT_COMMANDS \
    SRC_FILES \
    STATIC_LIBRARIES \
    STRIP_MODE \
    THIN_ARCHIVE \
    WHOLE_STATIC_LIBRARIES \

# The following are generated by the build scripts themselves

# LOCAL_MAKEFILE will contain the path to the Android.mk defining the module
modules-LOCALS += MAKEFILE

# LOCAL_LDFLAGS will contain the set of final linker flags for the module
modules-LOCALS += LDFLAGS

# LOCAL_OBJECTS will contain the list of object files generated from the
# module's sources, if any.
modules-LOCALS += OBJECTS

# LOCAL_BUILT_MODULE will contain the location of the symbolic version of
# the generated module (i.e. the one containing all symbols used during
# native debugging). It is generally under $PROJECT/obj/local/
modules-LOCALS += BUILT_MODULE

# LOCAL_OBJS_DIR will contain the location where the object files for
# this module will be stored. Usually $PROJECT/obj/local/<module>/obj
modules-LOCALS += OBJS_DIR

# LOCAL_INSTALLED will contain the location of the installed version
# of the module. Usually $PROJECT/libs/<abi>/<prefix><module><suffix>
# where <prefix> and <suffix> depend on the module class.
modules-LOCALS += INSTALLED

# LOCAL_MODULE_CLASS will contain the type of the module
# (e.g. STATIC_LIBRARY, SHARED_LIBRARY, etc...)
modules-LOCALS += MODULE_CLASS

# the list of managed fields per module
modules-fields = depends \
                 $(modules-LOCALS)

# -----------------------------------------------------------------------------
# Function : modules-clear
# Arguments: None
# Returns  : None
# Usage    : $(call modules-clear)
# Rationale: clears the list of defined modules known by the build system
# -----------------------------------------------------------------------------
modules-clear = \
    $(foreach __mod,$(__ndk_modules),\
        $(foreach __field,$(modules-fields),\
            $(eval __ndk_modules.$(__mod).$(__field) := $(empty))\
        )\
    )\
    $(eval __ndk_modules := $(empty_set)) \
    $(eval __ndk_top_modules := $(empty)) \
    $(eval __ndk_import_list := $(empty)) \
    $(eval __ndk_import_depth := $(empty))

# -----------------------------------------------------------------------------
# Function : modules-get-list
# Arguments: None
# Returns  : The list of all recorded modules
# Usage    : $(call modules-get-list)
# -----------------------------------------------------------------------------
modules-get-list = $(__ndk_modules)

# -----------------------------------------------------------------------------
# Function : modules-get-top-list
# Arguments: None
# Returns  : The list of all recorded non-imported modules
# Usage    : $(call modules-get-top-list)
# -----------------------------------------------------------------------------
modules-get-top-list = $(__ndk_top_modules)

# -----------------------------------------------------------------------------
# Function : module-add
# Arguments: 1: module name
# Returns  : None
# Usage    : $(call module-add,<modulename>)
# Rationale: add a new module. If it is already defined, print an error message
#            and abort. This will record all LOCAL_XXX variables for the module.
# -----------------------------------------------------------------------------
module-add = \
  $(call assert-defined,LOCAL_MAKEFILE LOCAL_BUILT_MODULE LOCAL_OBJS_DIR LOCAL_MODULE_CLASS)\
  $(if $(call set_is_member,$(__ndk_modules),$1),\
    $(call __ndk_info,Trying to define local module '$1' in $(LOCAL_MAKEFILE).)\
    $(call __ndk_info,But this module was already defined by $(__ndk_modules.$1.MAKEFILE).)\
    $(call __ndk_error,Aborting.)\
  )\
  $(eval __ndk_modules := $(call set_insert,$(__ndk_modules),$1))\
  $(if $(strip $(__ndk_import_depth)),,\
    $(eval __ndk_top_modules := $(call set_insert,$(__ndk_top_modules),$1))\
  )\
  $(if $(call module-class-is-installable,$(LOCAL_MODULE_CLASS)),\
    $(eval LOCAL_INSTALLED := $(NDK_APP_DST_DIR)/$(notdir $(LOCAL_BUILT_MODULE))),\
    $(eval LOCAL_INSTALLED := $(LOCAL_BUILT_MODULE))\
  )\
  $(foreach __field,STATIC_LIBRARIES WHOLE_STATIC_LIBRARIES SHARED_LIBRARIES,\
    $(eval LOCAL_$(__field) := $(call strip-lib-prefix,$(LOCAL_$(__field)))))\
  $(foreach __local,$(modules-LOCALS),\
    $(eval __ndk_modules.$1.$(__local) := $(LOCAL_$(__local)))\
  )\
  $(call module-handle-c++-features,$1)


# Retrieve the class of module $1
module-get-class = $(__ndk_modules.$1.MODULE_CLASS)

# Retrieve built location of module $1
module-get-built = $(__ndk_modules.$1.BUILT_MODULE)

# Returns $(true) is module $1 is installable
# An installable module is one that will be copied to $PROJECT/libs/<abi>/
# (e.g. shared libraries).
#
module-is-installable = $(call module-class-is-installable,$(call module-get-class,$1))

# Returns $(true) if module $1 is a copyable prebuilt
# A copyable prebuilt module is one that will be copied to $NDK_OUT/<abi>/
# at build time. At the moment, this is only used for prebuilt shared
# libraries, since it helps ndk-gdb.
#
module-is-copyable = $(call module-class-is-copyable,$(call module-get-class,$1))

# -----------------------------------------------------------------------------
# Function : module-get-export
# Arguments: 1: module name
#            2: export variable name without LOCAL_EXPORT_ prefix (e.g. 'CFLAGS')
# Returns  : Exported value
# Usage    : $(call module-get-export,<modulename>,<varname>)
# Rationale: Return the recorded value of LOCAL_EXPORT_$2, if any, for module $1
# -----------------------------------------------------------------------------
module-get-export = $(__ndk_modules.$1.EXPORT_$2)

# -----------------------------------------------------------------------------
# Function : module-get-listed-export
# Arguments: 1: list of module names
#            2: export variable name without LOCAL_EXPORT_ prefix (e.g. 'CFLAGS')
# Returns  : Exported values
# Usage    : $(call module-get-listed-export,<module-list>,<varname>)
# Rationale: Return the recorded value of LOCAL_EXPORT_$2, if any, for modules
#            listed in $1.
# -----------------------------------------------------------------------------
module-get-listed-export = $(strip \
    $(foreach __listed_module,$1,\
        $(call module-get-export,$(__listed_module),$2)\
    ))

# -----------------------------------------------------------------------------
# Function : modules-restore-locals
# Arguments: 1: module name
# Returns  : None
# Usage    : $(call module-restore-locals,<modulename>)
# Rationale: Restore the recorded LOCAL_XXX definitions for a given module.
# -----------------------------------------------------------------------------
module-restore-locals = \
    $(foreach __local,$(modules-LOCALS),\
        $(eval LOCAL_$(__local) := $(__ndk_modules.$1.$(__local)))\
    )

# Dump all module information. Only use this for debugging
modules-dump-database = \
    $(info Modules [$(TARGET_ARCH_ABI)]: $(__ndk_modules)) \
    $(foreach __mod,$(__ndk_modules),\
        $(info $(space4)$(__mod):)\
        $(foreach __field,$(modules-fields),\
            $(eval __fieldval := $(strip $(__ndk_modules.$(__mod).$(__field))))\
            $(if $(__fieldval),\
                $(if $(filter 1,$(words $(__fieldval))),\
                    $(info $(space4)$(space4)$(__field): $(__fieldval)),\
                    $(info $(space4)$(space4)$(__field): )\
                    $(foreach __fielditem,$(__fieldval),\
                        $(info $(space4)$(space4)$(space4)$(__fielditem))\
                    )\
                )\
            )\
        )\
    )\
    $(info Top modules: $(__ndk_top_modules))\
    $(info --- end of modules list)


# -----------------------------------------------------------------------------
# Function : module-add-static-depends
# Arguments: 1: module name
#            2: list/set of static library modules this module depends on.
# Returns  : None
# Usage    : $(call module-add-static-depends,<modulename>,<list of module names>)
# Rationale: Record that a module depends on a set of static libraries.
#            Use module-get-static-dependencies to retrieve final list.
# -----------------------------------------------------------------------------
module-add-static-depends = \
    $(call module-add-depends-any,$1,$2,depends) \

# -----------------------------------------------------------------------------
# Function : module-add-shared-depends
# Arguments: 1: module name
#            2: list/set of shared library modules this module depends on.
# Returns  : None
# Usage    : $(call module-add-shared-depends,<modulename>,<list of module names>)
# Rationale: Record that a module depends on a set of shared libraries.
#            Use modulge-get-shared-dependencies to retrieve final list.
# -----------------------------------------------------------------------------
module-add-shared-depends = \
    $(call module-add-depends-any,$1,$2,depends) \

# Used internally by module-add-static-depends and module-add-shared-depends
# NOTE: this function must not modify the existing dependency order when new depends are added.
#
module-add-depends-any = \
    $(eval __ndk_modules.$1.$3 += $(filter-out $(__ndk_modules.$1.$3),$2))


# -----------------------------------------------------------------------------
# Returns non-empty if a module is a static library
# Arguments: 1: module name
# Returns     : non-empty iff the module is a static library.
# Usage       : $(if $(call module-is-static-library,<name>),...)
# -----------------------------------------------------------------------------
module-is-static-library = $(strip \
  $(filter STATIC_LIBRARY PREBUILT_STATIC_LIBRARY,\
    $(call module-get-class,$1)))

# -----------------------------------------------------------------------------
# Returns non-empty if a module is a shared library
# Arguments: 1: module name
# Returns     : non-empty iff the module is a shared library.
# Usage       : $(if $(call module-is-shared-library,<name>),...)
# -----------------------------------------------------------------------------
module-is-shared-library = $(strip \
  $(filter SHARED_LIBRARY PREBUILT_SHARED_LIBRARY,\
    $(call module-get-class,$1)))

# -----------------------------------------------------------------------------
# Filter a list of module names to retain only the static libraries.
# Arguments: 1: module name list
# Returns     : input list modules which are static libraries.
# -----------------------------------------------------------------------------
module-filter-static-libraries = $(call filter-by,$1,module-is-static-library)

# -----------------------------------------------------------------------------
# Filter a list of module names to retain only the shared libraries.
# Arguments: 1: module name list
# Returns     : input list modules which are shared libraries.
# -----------------------------------------------------------------------------
module-filter-shared-libraries = $(call filter-by,$1,module-is-shared-library)

# -----------------------------------------------------------------------------
# Return the LOCAL_STATIC_LIBRARIES for a given module.
# Arguments: 1: module name
# Returns     : List of static library modules.
# -----------------------------------------------------------------------------
module-get-static-libs = $(__ndk_modules.$1.STATIC_LIBRARIES)

# -----------------------------------------------------------------------------
# Return the LOCAL_WHOLE_STATIC_LIBRARIES for a given module.
# Arguments: 1: module name
# Returns     : List of whole static library modules.
# -----------------------------------------------------------------------------
module-get-whole-static-libs = $(__ndk_modules.$1.WHOLE_STATIC_LIBRARIES)

# -----------------------------------------------------------------------------
# Return all static libraries for a given module.
# Arguments: 1: module name
# Returns     : List of static library modules (whole or not).
# -----------------------------------------------------------------------------
module-get-all-static-libs = $(strip \
  $(__ndk_modules.$1.STATIC_LIBRARIES) \
  $(__ndk_modules.$1.WHOLE_STATIC_LIBRARIES))

# -----------------------------------------------------------------------------
# Return the list of LOCAL_SHARED_LIBRARIES for a given module.
# Arguments: 1: module name
# Returns     : List of shared library modules.
# -----------------------------------------------------------------------------
module-get-shared-libs = $(__ndk_modules.$1.SHARED_LIBRARIES)

# -----------------------------------------------------------------------------
# Return the list of all libraries a modules depends directly on.
# This is the concatenation of its LOCAL_STATIC_LIBRARIES,
# LOCAL_WHOLE_STATIC_LIBRARIES, and LOCAL_SHARED_LIBRARIES variables.
# Arguments: 1: module name
# Returns     : List of library modules (static or shared).
# -----------------------------------------------------------------------------
module-get-direct-libs = $(strip \
  $(__ndk_modules.$1.STATIC_LIBRARIES) \
  $(__ndk_modules.$1.WHOLE_STATIC_LIBRARIES) \
  $(__ndk_modules.$1.SHARED_LIBRARIES))


# -----------------------------------------------------------------------------
# Computes the full closure of a module and its dependencies. Order is
# defined by a breadth-first walk of the graph.
# $1 will be the first item in the result.
#
# Arguments: 1: module name
# Returns     : List of all modules $1 depends on.
#
# Note: Do not use this to determine build dependencies. The returned list
#       is much too large for this. For example consider the following
#       dependency graph:
#
#   main.exe -> libA.a -> libfoo.so -> libB.a
#
#       This function will return all four modules in the result, while
#       at link time building main.exe only requires the first three.
#
# -----------------------------------------------------------------------------
module-get-all-dependencies = $(call -ndk-mod-get-closure,$1,module-get-depends)

# Same as module-get-all-dependencies, but topologically sorted.
module-get-all-dependencies-topo = \
    $(call -ndk-mod-get-topological-depends,$1,module-get-all-dependencies)

# -----------------------------------------------------------------------------
# Compute the list of all static and shared libraries required to link a
# given module.
#
# Note that the result is topologically ordered, i.e. if library A depends
# on library B, then A will always appear after B in the result.
#
# Arguments: 1: module name
# Returns     : List of all library $1 depends at link time.
#
# Note: This doesn't differentiate between regular and whole static
#       libraries. Use module-extract-whole-static-libs to filter the
#       result returned by this function.
# -----------------------------------------------------------------------------
module-get-link-libs = $(strip \
  $(eval _ndk_mod_link_module := $1) \
  $(call -ndk-mod-get-topological-depends,$1,-ndk-mod-link-deps))

# Special dependency function used by module-get-link-libs.
# The rules to follow are the following:
#  - if $1 is the link module, or if it is a static library, then all
#    direct dependencies.
#  - otherwise, the module is a shared library, don't add build deps.
-ndk-mod-link-deps = \
  $(if $(call seq,$1,$(_ndk_mod_link_module))$(call module-is-static-library,$1),\
    $(call module-get-direct-libs,$1))

# -----------------------------------------------------------------------------
# This function is used to extract the list of static libraries that need
# to be linked as whole, i.e. placed in a special section on the final
# link command.
# Arguments: $1: module name.
#            $2: list of all static link-time libraries (regular or whole).
# Returns  : list of static libraries from '$2' that need to be linked
#            as whole.
# -----------------------------------------------------------------------------
module-extract-whole-static-libs = $(strip \
  $(eval _ndk_mod_whole_all := $(call map,module-get-whole-static-libs,$1 $2))\
  $(eval _ndk_mod_whole_result := $(filter $(_ndk_mod_whole_all),$2))\
  $(_ndk_mod_whole_result))

# Used to recompute all dependencies once all module information has been recorded.
modules-compute-dependencies = \
    $(foreach __module,$(__ndk_modules),\
        $(call module-compute-depends,$(__module))\
    )

# Recurses though modules imported by $1 to come up with the transitive closure
# of imports.
# $1: Module
# $2: Import type (STATIC_LIBRARIES or SHARED_LIBRARIES)
module_get_recursive_imports = \
    $(eval _from_static_libs.$1 := \
        $(call module-get-listed-export,\
            $(__ndk_modules.$1.STATIC_LIBRARIES),$2))\
    $(eval _from_shared_libs.$1 := \
        $(call module-get-listed-export,\
            $(__ndk_modules.$1.SHARED_LIBRARIES),$2))\
    $(eval _from_imports.$1 := \
        $(foreach _import,$(_from_static_libs.1),\
            $(call module_get_recursive_imports,$(_import),$2))\
        $(foreach _import,$(_from_shared_libs.$1),\
            $(call module_get_recursive_imports,$(_import),$2)))\
    $(_from_static_libs.$1) $(_from_shared_libs.$1) $(_from_imports.$1)

# Fills __ndk_modules.$1.depends with a list of all the modules that $1 depends
# on. Note that this runs before import-locals.mk is run (import-locals.mk needs
# this information), so we have to explicitly check for exported libraries from
# our dependencies. Imported libraries might in turn export more libraries to
# us, so do this recursively.
module-compute-depends = \
    $(call module-add-static-depends,$1,$(__ndk_modules.$1.STATIC_LIBRARIES))\
    $(call module-add-static-depends,$1,$(__ndk_modules.$1.WHOLE_STATIC_LIBRARIES))\
    $(call module-add-shared-depends,$1,$(__ndk_modules.$1.SHARED_LIBRARIES))\
    $(call module-add-static-depends,$1,\
        $(call module_get_recursive_imports,$1,STATIC_LIBRARIES))\
    $(call module-add-shared-depends,$1,\
        $(call module_get_recursive_imports,$1,SHARED_LIBRARIES))\

module-get-installed = $(__ndk_modules.$1.INSTALLED)

module-get-depends = $(__ndk_modules.$1.depends)

# -----------------------------------------------------------------------------
# Function : modules-get-all-installable
# Arguments: 1: list of module names
# Returns  : List of all the installable modules $1 depends on transitively.
# Usage    : $(call modules-all-get-installable,<list of module names>)
# Rationale: This computes the closure of all installable module dependencies starting from $1
# -----------------------------------------------------------------------------
# For now, only the closure of LOCAL_SHARED_LIBRARIES is enough
modules-get-all-installable = $(strip \
    $(foreach __alldep,$(call module-get-all-dependencies,$1),\
        $(if $(call module-is-installable,$(__alldep)),$(__alldep))\
    ))

# Return the C++ extension(s) of a given module
# $1: module name
module-get-c++-extensions = $(strip \
    $(if $(__ndk_modules.$1.CPP_EXTENSION),\
        $(__ndk_modules.$1.CPP_EXTENSION),\
        $(default-c++-extensions)\
    ))

# Return the list of C++ sources of a given module
#
module-get-c++-sources = \
    $(eval __files := $(__ndk_modules.$1.SRC_FILES:%.neon=%)) \
    $(eval __files := $(__files:%.arm=%)) \
    $(eval __extensions := $(call module-get-c++-extensions,$1))\
    $(filter $(foreach __extension,$(__extensions),%$(__extension)),$(__files))

# Returns a non-empty string if a module has C++ sources
module-has-c++-sources = $(strip $(call module-get-c++-sources,$1) \
                                 $(filter true,$(__ndk_modules.$1.HAS_CPP)))

# Return the compiler flags used to compile a C++ module
# Order matters and should match the one used by the build command
module-get-c++-flags = $(strip \
    $(__ndk_modules.$1.CFLAGS) \
    $(__ndk_modules.$1.CPPFLAGS) \
    $(__ndk_modules.$1.CXXFLAGS))

# This function is used to remove certain flags from a module compiler flags
# $1: Module name
# $2: List of flags to remove
#
module-filter-out-compiler-flags = \
    $(eval __ndk_modules.$1.CFLAGS     := $(filter-out $2,$(__ndk_modules.$1.CFLAGS)))\
    $(eval __ndk_modules.$1.CONLYFLAGS := $(filter-out $2,$(__ndk_modules.$1.CONLYFLAGS)))\
    $(eval __ndk_modules.$1.CPPFLAGS   := $(filter-out $2,$(__ndk_modules.$1.CPPFLAGS)))\
    $(eval __ndk_modules.$1.CXXFLAGS   := $(filter-out $2,$(__ndk_modules.$1.CXXFLAGS)))\
    $(eval __ndk_modules.$1.ASMFLAGS   := $(filter-out $2,$(__ndk_modules.$1.ASMFLAGS)))

# Return true if a module's compiler flags enable rtti
# We just look at -frtti and -fno-rtti on the command-line
# and keep the last one of these flags.
module-flags-have-rtti = $(strip \
        $(filter -frtti,\
            $(lastword $(filter -frtti -fno-rtti,$(call module-get-c++-flags,$1)))\
        )\
    )

# Same with C++ exception support (i.e. -fexceptions and -fno-exceptions)
#
module-flags-have-exceptions = $(strip \
        $(filter -fexceptions,\
            $(lastword $(filter -fexceptions -fno-execeptions,$(call module-get-c++-flags,$1)))\
        )\
    )

# Handle the definition of LOCAL_CPP_FEATURES, i.e.:
#
#  - If it is defined, check that it only contains valid values
#  - If it is undefined, try to compute its value automatically by
#    looking at the C++ compiler flags used to build the module
#
# After this, we remove all features flags from the module's command-line
# And add only the correct ones back in LOCAL_CPP_FLAGS
#
module-handle-c++-features = \
    $(if $(strip $(__ndk_modules.$1.CPP_FEATURES)),\
        $(eval __cxxbad := $(filter-out rtti exceptions,$(__ndk_modules.$1.CPP_FEATURES)))\
        $(if $(__cxxbad),\
            $(call __ndk_info,WARNING: Ignoring invalid values in LOCAL_CPP_FEATURES definition in $(__ndk_modules.$1.MAKEFILE): $(__cxxbad))\
            $(eval __ndk_modules.$1.CPP_FEATURES := $(strip $(filter-out $(__cxxbad),$(__ndk_modules.$1.CPP_FEATURES))))\
        )\
    ,\
        $(eval __ndk_modules.$1.CPP_FEATURES := $(strip \
            $(if $(call module-flags-have-rtti,$1),rtti) \
            $(if $(call module-flags-have-exceptions,$1),exceptions) \
        )) \
    )\
    $(call module-filter-out-compiler-flags,$1,-frtti -fno-rtti -fexceptions -fno-exceptions)\

# Returns true if a module or its dependencies have specific C++ features
# (i.e. RTTI or Exceptions)
#
# $1: module name
# $2: list of features (e.g. 'rtti' or 'exceptions')
#
module-has-c++-features = $(strip \
    $(eval __cxxdeps  := $(call module-get-all-dependencies,$1))\
    $(eval __cxxflags := $(foreach __cxxdep,$(__cxxdeps),$(__ndk_modules.$(__cxxdep).CPP_FEATURES)))\
    $(if $(filter $2,$(__cxxflags)),true,)\
    )

# Returns a non-empty string if the module should be linked with clang++ rather
# than clang.
#
# A module should use clang++ iff it has C++ sources itself or if it depends on
# a static library with C++ sources. We do not need to use clang++ for shared
# library dependencies.
module_needs_clangxx = $(strip \
  $(call module-has-c++-sources,$1)\
  $(foreach __dep,$(call module-get-all-dependencies,$1),\
    $(if $(call module-is-static-library,$(__dep)),\
      $(call module-has-c++-sources,$(__dep))\
    )\
  )\
)

# =============================================================================
#
# Utility functions
#
# =============================================================================

# -----------------------------------------------------------------------------
# Function : pretty-dir
# Arguments: 1: path
# Returns  : Remove NDK_PROJECT_PATH prefix from a given path. This can be
#            used to perform pretty-printing for logs.
# -----------------------------------------------------------------------------
pretty-dir = $(patsubst $(NDK_ROOT)/%,<NDK>/%,\
                 $(patsubst $(NDK_PROJECT_PATH)/%,%,$1))

# Note: NDK_PROJECT_PATH is typically defined after this test is run.
-test-pretty-dir = \
  $(eval NDK_PROJECT_PATH ?= .)\
  $(call test-expect,foo,$(call pretty-dir,foo))\
  $(call test-expect,foo,$(call pretty-dir,$(NDK_PROJECT_PATH)/foo))\
  $(call test-expect,foo/bar,$(call pretty-dir,$(NDK_PROJECT_PATH)/foo/bar))\
  $(call test-expect,<NDK>/foo,$(call pretty-dir,$(NDK_ROOT)/foo))\
  $(call test-expect,<NDK>/foo/bar,$(call pretty-dir,$(NDK_ROOT)/foo/bar))

# -----------------------------------------------------------------------------
# Function : check-user-define
# Arguments: 1: name of variable that must be defined by the user
#            2: name of Makefile where the variable should be defined
#            3: name/description of the Makefile where the check is done, which
#               must be included by $2
# Returns  : None
# -----------------------------------------------------------------------------
check-user-define = $(if $(strip $($1)),,\
  $(call __ndk_error,Missing $1 before including $3 in $2))

# -----------------------------------------------------------------------------
# This is used to check that LOCAL_MODULE is properly defined by an Android.mk
# file before including one of the $(BUILD_SHARED_LIBRARY), etc... files.
#
# Function : check-user-LOCAL_MODULE
# Arguments: 1: name/description of the included build Makefile where the
#               check is done
# Returns  : None
# Usage    : $(call check-user-LOCAL_MODULE, BUILD_SHARED_LIBRARY)
# -----------------------------------------------------------------------------
check-defined-LOCAL_MODULE = \
  $(call check-user-define,LOCAL_MODULE,$(local-makefile),$(1)) \
  $(if $(call seq,$(words $(LOCAL_MODULE)),1),,\
    $(call __ndk_info,LOCAL_MODULE definition in $(local-makefile) must not contain space)\
    $(call __ndk_error,Please correct error. Aborting)\
  )

# -----------------------------------------------------------------------------
# This is used to check that LOCAL_MODULE_FILENAME, if defined, is correct.
#
# Function : check-user-LOCAL_MODULE_FILENAME
# Returns  : None
# Usage    : $(call check-user-LOCAL_MODULE_FILENAME)
# -----------------------------------------------------------------------------
check-LOCAL_MODULE_FILENAME = \
  $(if $(strip $(LOCAL_MODULE_FILENAME)),\
    $(if $(call seq,$(words $(LOCAL_MODULE_FILENAME)),1),,\
        $(call __ndk_info,$(LOCAL_MAKEFILE):$(LOCAL_MODULE): LOCAL_MODULE_FILENAME must not contain spaces)\
        $(call __ndk_error,Plase correct error. Aborting)\
    )\
    $(if $(filter %$(TARGET_LIB_EXTENSION) %$(TARGET_SONAME_EXTENSION),$(LOCAL_MODULE_FILENAME)),\
        $(call __ndk_info,$(LOCAL_MAKEFILE):$(LOCAL_MODULE): LOCAL_MODULE_FILENAME should not include file extensions)\
    )\
  )

# -----------------------------------------------------------------------------
# Function  : handle-module-filename
# Arguments : 1: default file prefix
#             2: file suffix
# Returns   : None
# Usage     : $(call handle-module-filename,<prefix>,<suffix>)
# Rationale : To be used to check and or set the module's filename through
#             the LOCAL_MODULE_FILENAME variable.
# -----------------------------------------------------------------------------
handle-module-filename = $(eval $(call ev-handle-module-filename,$1,$2))

#
# Check that LOCAL_MODULE_FILENAME is properly defined
# - with one single item
# - without a library file extension
# - with no directory separators
#
define ev-check-module-filename
ifneq (1,$$(words $$(LOCAL_MODULE_FILENAME)))
    $$(call __ndk_info,$$(LOCAL_MAKEFILE):$$(LOCAL_MODULE): LOCAL_MODULE_FILENAME must not contain any space)
    $$(call __ndk_error,Aborting)
endif
ifneq (,$$(filter %$$(TARGET_LIB_EXTENSION) %$$(TARGET_SONAME_EXTENSION),$$(LOCAL_MODULE_FILENAME)))
    $$(call __ndk_info,$$(LOCAL_MAKEFILE):$$(LOCAL_MODULE): LOCAL_MODULE_FILENAME must not contain a file extension)
    $$(call __ndk_error,Aborting)
endif
ifneq (1,$$(words $$(subst /, ,$$(LOCAL_MODULE_FILENAME))))
    $$(call __ndk_info,$$(LOCAL_MAKEFILE):$$(LOCAL_MODULE): LOCAL_MODULE_FILENAME must not contain directory separators)
    $$(call __ndk_error,Aborting)
endif
endef

#
# Check the definition of LOCAL_MODULE_FILENAME. If none exists,
# infer it from the LOCAL_MODULE name.
#
# $1: default file prefix
# $2: default file suffix
#
define ev-handle-module-filename
LOCAL_MODULE_FILENAME := $$(strip $$(LOCAL_MODULE_FILENAME))
ifndef LOCAL_MODULE_FILENAME
    LOCAL_MODULE_FILENAME := $1$$(LOCAL_MODULE)
endif
$$(eval $$(call ev-check-module-filename))
LOCAL_MODULE_FILENAME := $$(LOCAL_MODULE_FILENAME)$2
endef

handle-prebuilt-module-filename = $(eval $(call ev-handle-prebuilt-module-filename,$1))

#
# Check the definition of LOCAL_MODULE_FILENAME for a _prebuilt_ module.
# If none exists, infer it from $(LOCAL_SRC_FILES)
#
# $1: default file suffix
#
define ev-handle-prebuilt-module-filename
LOCAL_MODULE_FILENAME := $$(strip $$(LOCAL_MODULE_FILENAME))
ifndef LOCAL_MODULE_FILENAME
    LOCAL_MODULE_FILENAME := $$(notdir $(LOCAL_SRC_FILES))
    LOCAL_MODULE_FILENAME := $$(LOCAL_MODULE_FILENAME:%$$(TARGET_LIB_EXTENSION)=%)
    LOCAL_MODULE_FILENAME := $$(LOCAL_MODULE_FILENAME:%$$(TARGET_SONAME_EXTENSION)=%)
endif
LOCAL_MODULE_FILENAME := $$(LOCAL_MODULE_FILENAME)$1
$$(eval $$(call ev-check-module-filename))
endef


# -----------------------------------------------------------------------------
# Function  : handle-module-built
# Returns   : None
# Usage     : $(call handle-module-built)
# Rationale : To be used to automatically compute the location of the generated
#             binary file, and the directory where to place its object files.
# -----------------------------------------------------------------------------
handle-module-built = \
    $(eval LOCAL_BUILT_MODULE := $(TARGET_OUT)/$(LOCAL_MODULE_FILENAME))\
    $(eval LOCAL_OBJS_DIR     := $(TARGET_OBJS)/$(LOCAL_MODULE))

# -----------------------------------------------------------------------------
# Compute the real path of a prebuilt file.
#
# Function : local-prebuilt-path
# Arguments: 1: prebuilt path (as listed in $(LOCAL_SRC_FILES))
# Returns  : full path. If $1 begins with a /, the path is considered
#            absolute and returned as-is. Otherwise, $(LOCAL_PATH)/$1 is
#            returned instead.
# Usage    : $(call local-prebuilt-path,$(LOCAL_SRC_FILES))
# -----------------------------------------------------------------------------
local-prebuilt-path = $(call local-source-file-path,$1)

# -----------------------------------------------------------------------------
# This is used to strip any lib prefix from LOCAL_MODULE, then check that
# the corresponding module name is not already defined.
#
# Function : check-user-LOCAL_MODULE
# Arguments: 1: path of Android.mk where this LOCAL_MODULE is defined
# Returns  : None
# Usage    : $(call check-LOCAL_MODULE,$(LOCAL_MAKEFILE))
# -----------------------------------------------------------------------------
check-LOCAL_MODULE = \
  $(eval LOCAL_MODULE := $$(call strip-lib-prefix,$$(LOCAL_MODULE)))

# -----------------------------------------------------------------------------
# Macro    : my-dir
# Returns  : the directory of the current Makefile
# Usage    : $(my-dir)
# -----------------------------------------------------------------------------
my-dir = $(call parent-dir,$(lastword $(MAKEFILE_LIST)))

# -----------------------------------------------------------------------------
# Function : all-makefiles-under
# Arguments: 1: directory path
# Returns  : a list of all makefiles immediately below some directory
# Usage    : $(call all-makefiles-under, <some path>)
# -----------------------------------------------------------------------------
all-makefiles-under = $(wildcard $1/*/Android.mk)

# -----------------------------------------------------------------------------
# Macro    : all-subdir-makefiles
# Returns  : list of all makefiles in subdirectories of the current Makefile's
#            location
# Usage    : $(all-subdir-makefiles)
# -----------------------------------------------------------------------------
all-subdir-makefiles = $(call all-makefiles-under,$(call my-dir))

# =============================================================================
#
# Source file tagging support.
#
# Each source file listed in LOCAL_SRC_FILES can have any number of
# 'tags' associated to it. A tag name must not contain space, and its
# usage can vary.
#
# For example, the 'debug' tag is used to sources that must be built in debug
# mode, the 'arm' tag is used for sources that must be built using the 32-bit
# instruction set on ARM platforms. Historically .neon was used to enable Neon
# for a given source file, but Neon was made the default in r21 and non-Neon
# mode is no longer supported in r24 so these tags are accepted but have no
# effect. A no_neon tag was supported as an implementation detail only; it could
# not be used by Android.mk files, and is no longer present.
#
# More tags might be introduced in the future.
#
#  LOCAL_SRC_TAGS contains the list of all tags used (initially empty)
#  LOCAL_SRC_FILES contains the list of all source files.
#  LOCAL_SRC_TAG.<tagname> contains the set of source file names tagged
#      with <tagname>
#  LOCAL_SRC_FILES_TAGS.<filename> contains the set of tags for a given
#      source file name
#
# Tags are processed by a toolchain-specific function (e.g. TARGET-compute-cflags)
# which will call various functions to compute source-file specific settings.
# These are currently stored as:
#
#  LOCAL_SRC_FILES_TARGET_CFLAGS.<filename> contains the list of
#      target-specific C compiler flags used to compile a given
#      source file. This is set by the function TARGET-set-cflags
#      defined in the toolchain's setup.mk script.
#
#  LOCAL_SRC_FILES_TEXT.<filename> contains the 'text' that will be
#      displayed along the label of the build output line. For example
#      'thumb' or 'arm  ' with ARM-based toolchains.
#
# =============================================================================

# -----------------------------------------------------------------------------
# Macro    : escape-colon-in-path
# Returns  : replace colon in $1 with $(colon)
# Usage    : $(escape-colon-in-path,<file>)
# -----------------------------------------------------------------------------
escape-colon-in-path = $(subst $(colon),$$(colon),$1)

# -----------------------------------------------------------------------------
# Macro    : clear-all-src-tags
# Returns  : remove all source file tags and associated data.
# Usage    : $(clear-all-src-tags)
# -----------------------------------------------------------------------------
clear-all-src-tags = \
$(foreach __tag,$(LOCAL_SRC_TAGS), \
    $(eval LOCAL_SRC_TAG.$(__tag) := $(empty)) \
) \
$(foreach __src,$(LOCAL_SRC_FILES), \
    $(eval LOCAL_SRC_FILES_TAGS.$(call escape-colon-in-path,$(__src)) := $(empty)) \
    $(eval LOCAL_SRC_FILES_TARGET_CFLAGS.$(call escape-colon-in-path,$(__src)) := $(empty)) \
    $(eval LOCAL_SRC_FILES_TEXT.$(call escape-colon-in-path,$(__src)) := $(empty)) \
) \
$(eval LOCAL_SRC_TAGS := $(empty_set))

# -----------------------------------------------------------------------------
# Macro    : tag-src-files
# Arguments: 1: list of source files to tag
#            2: tag name (must not contain space)
# Usage    : $(call tag-src-files,<list-of-source-files>,<tagname>)
# Rationale: Add a tag to a list of source files
# -----------------------------------------------------------------------------
tag-src-files = \
$(eval LOCAL_SRC_TAGS := $(call set_insert,$2,$(LOCAL_SRC_TAGS))) \
$(eval LOCAL_SRC_TAG.$2 := $(call set_union,$1,$(LOCAL_SRC_TAG.$2))) \
$(foreach __src,$1, \
    $(eval LOCAL_SRC_FILES_TAGS.$(call escape-colon-in-path,$(__src)) += $2) \
)

# -----------------------------------------------------------------------------
# Macro    : get-src-files-with-tag
# Arguments: 1: tag name
# Usage    : $(call get-src-files-with-tag,<tagname>)
# Return   : The list of source file names that have been tagged with <tagname>
# -----------------------------------------------------------------------------
get-src-files-with-tag = $(LOCAL_SRC_TAG.$1)

# -----------------------------------------------------------------------------
# Macro    : get-src-files-without-tag
# Arguments: 1: tag name
# Usage    : $(call get-src-files-without-tag,<tagname>)
# Return   : The list of source file names that have NOT been tagged with <tagname>
# -----------------------------------------------------------------------------
get-src-files-without-tag = $(filter-out $(LOCAL_SRC_TAG.$1),$(LOCAL_SRC_FILES))

# -----------------------------------------------------------------------------
# Macro    : set-src-files-target-cflags
# Arguments: 1: list of source files
#            2: list of compiler flags
# Usage    : $(call set-src-files-target-cflags,<sources>,<flags>)
# Rationale: Set or replace the set of compiler flags that will be applied
#            when building a given set of source files. This function should
#            normally be called from the toolchain-specific function that
#            computes all compiler flags for all source files.
# -----------------------------------------------------------------------------
set-src-files-target-cflags = \
    $(foreach __src,$1,$(eval LOCAL_SRC_FILES_TARGET_CFLAGS.$(call escape-colon-in-path,$(__src)) := $2))

# -----------------------------------------------------------------------------
# Macro    : add-src-files-target-cflags
# Arguments: 1: list of source files
#            2: list of compiler flags
# Usage    : $(call add-src-files-target-cflags,<sources>,<flags>)
# Rationale: A variant of set-src-files-target-cflags that can be used
#            to append, instead of replace, compiler flags for specific
#            source files.
# -----------------------------------------------------------------------------
add-src-files-target-cflags = \
    $(foreach __src,$1,$(eval LOCAL_SRC_FILES_TARGET_CFLAGS.$(call escape-colon-in-path,$(__src)) += $2))

# -----------------------------------------------------------------------------
# Macro    : get-src-file-target-cflags
# Arguments: 1: single source file name
# Usage    : $(call get-src-file-target-cflags,<source>)
# Rationale: Return the set of target-specific compiler flags that must be
#            applied to a given source file. These must be set prior to this
#            call using set-src-files-target-cflags or add-src-files-target-cflags
# -----------------------------------------------------------------------------
get-src-file-target-cflags = $(LOCAL_SRC_FILES_TARGET_CFLAGS.$1)

# -----------------------------------------------------------------------------
# Macro    : set-src-files-text
# Arguments: 1: list of source files
#            2: text
# Usage    : $(call set-src-files-text,<sources>,<text>)
# Rationale: Set or replace the 'text' associated to a set of source files.
#            The text is a very short string that complements the build
#            label. For example, it will be either 'thumb' or 'arm  ' for
#            ARM-based toolchains. This function must be called by the
#            toolchain-specific functions that processes all source files.
# -----------------------------------------------------------------------------
set-src-files-text = \
    $(foreach __src,$1,$(eval LOCAL_SRC_FILES_TEXT.$(call escape-colon-in-path,$(__src)) := $2))

# -----------------------------------------------------------------------------
# Macro    : get-src-file-text
# Arguments: 1: single source file
# Usage    : $(call get-src-file-text,<source>)
# Rationale: Return the 'text' associated to a given source file when
#            set-src-files-text was called.
# -----------------------------------------------------------------------------
get-src-file-text = $(LOCAL_SRC_FILES_TEXT.$1)

# This should only be called for debugging the source files tagging system
dump-src-file-tags = \
$(info LOCAL_SRC_TAGS := $(LOCAL_SRC_TAGS)) \
$(info LOCAL_SRC_FILES = $(LOCAL_SRC_FILES)) \
$(foreach __tag,$(LOCAL_SRC_TAGS),$(info LOCAL_SRC_TAG.$(__tag) = $(LOCAL_SRC_TAG.$(__tag)))) \
$(foreach __src,$(LOCAL_SRC_FILES),$(info LOCAL_SRC_FILES_TAGS.$(__src) = $(LOCAL_SRC_FILES_TAGS.$(__src)))) \
$(info WITH arm = $(call get-src-files-with-tag,arm)) \
$(info WITHOUT arm = $(call get-src-files-without-tag,arm)) \
$(foreach __src,$(LOCAL_SRC_FILES),$(info LOCAL_SRC_FILES_TARGET_CFLAGS.$(__src) = $(LOCAL_SRC_FILES_TARGET_CFLAGS.$(__src)))) \
$(foreach __src,$(LOCAL_SRC_FILES),$(info LOCAL_SRC_FILES_TEXT.$(__src) = $(LOCAL_SRC_FILES_TEXT.$(__src)))) \


# =============================================================================
#
# Application.mk support
#
# =============================================================================

# the list of variables that *must* be defined in Application.mk files
NDK_APP_VARS_REQUIRED :=

# the list of variables that *may* be defined in Application.mk files
NDK_APP_VARS_OPTIONAL := \
    APP_ABI \
    APP_ASFLAGS \
    APP_ASMFLAGS \
    APP_BUILD_SCRIPT \
    APP_CFLAGS \
    APP_CLANG_TIDY \
    APP_CLANG_TIDY_FLAGS \
    APP_CONLYFLAGS \
    APP_CPPFLAGS \
    APP_CXXFLAGS \
    APP_LDFLAGS \
    APP_MODULES \
    APP_OPTIM \
    APP_PLATFORM \
    APP_PROJECT_PATH \
    APP_SHORT_COMMANDS \
    APP_STL \
    APP_STRIP_MODE \
    APP_SUPPORT_FLEXIBLE_PAGE_SIZES \
    APP_THIN_ARCHIVE \
    APP_WEAK_API_DEFS \
    APP_WRAP_SH \

# NDK_ALL_ABIS is not configured yet.
NDK_APP_VARS_OPTIONAL += \
    APP_WRAP_SH_armeabi-v7a \
    APP_WRAP_SH_arm64-v8a \
    APP_WRAP_SH_riscv64 \
    APP_WRAP_SH_x86 \
    APP_WRAP_SH_x86_64 \

# the list of all variables that may appear in an Application.mk file
# or defined by the build scripts.
NDK_APP_VARS := \
    $(NDK_APP_VARS_REQUIRED) \
    $(NDK_APP_VARS_OPTIONAL) \
    APP_DEBUG \
    APP_DEBUGGABLE \
    APP_MANIFEST \

# =============================================================================
#
# Android.mk support
#
# =============================================================================

# =============================================================================
#
# Build commands support
#
# =============================================================================

get-object-name = $(strip \
    $(subst ../,__/,\
      $(subst :,_,\
        $(eval __obj := $1)\
        $(foreach __ext,.c .s .S .asm $(LOCAL_CPP_EXTENSION),\
            $(eval __obj := $(__obj:%$(__ext)=%$(TARGET_OBJ_EXTENSION)))\
        )\
        $(__obj)\
    )))

-test-get-object-name = \
  $(eval TARGET_OBJ_EXTENSION=.o)\
  $(eval LOCAL_CPP_EXTENSION ?= .cpp)\
  $(call test-expect,foo.o,$(call get-object-name,foo.c))\
  $(call test-expect,bar.o,$(call get-object-name,bar.s))\
  $(call test-expect,zoo.o,$(call get-object-name,zoo.S))\
  $(call test-expect,tot.o,$(call get-object-name,tot.cpp))\
  $(call test-expect,goo.o,$(call get-object-name,goo.asm))

# -----------------------------------------------------------------------------
# Macro    : hide
# Returns  : nothing
# Usage    : $(hide)<make commands>
# Rationale: To be used as a prefix for Make build commands to hide them
#            by default during the build. To show them, set V=1 in your
#            environment or command-line.
#
#            For example:
#
#                foo.o: foo.c
#                -->|$(hide) <build-commands>
#
#            Where '-->|' stands for a single tab character.
#
# -----------------------------------------------------------------------------
ifeq ($(V),1)
hide = $(empty)
else
hide = @
endif


# -----------------------------------------------------------------------------
# Function  : local-source-file-path
# Parameters: $1: source file (as listed in LOCAL_SRC_FILES)
# Returns   : full source file path of $1
# Usage     : $(call local-source-file-path,$1)
# Rationale : Used to compute the full path of a source listed in
#             LOCAL_SRC_FILES. If it is an absolute path, then this
#             returns the input, otherwise, prepends $(LOCAL_PATH)/
#             to the result.
# -----------------------------------------------------------------------------
local-source-file-path = $(if $(call host-path-is-absolute,$1),$1,$(LOCAL_PATH)/$1)

# This assumes that many variables have been pre-defined:
# _SRC: source file
# _OBJ: destination file
# _CC: 'compiler' command
# _FLAGS: 'compiler' flags
# _TEXT: Display text (e.g. "Compile++ thumb", must be EXACTLY 15 chars long)
#
# The output object is removed before the compile step as a fix for
# https://github.com/android-ndk/ndk/issues/603. tl;dr: Object files may not
# necessarily be removed when compilation fails. .DELETE_ON_ERROR may not help
# here because that only removes the output if the output changes.
define ev-build-file
$$(_OBJ): PRIVATE_ABI      := $$(TARGET_ARCH_ABI)
$$(_OBJ): PRIVATE_SRC      := $$(_SRC)
$$(_OBJ): PRIVATE_OBJ      := $$(_OBJ)
$$(_OBJ): PRIVATE_DEPS     := $$(call host-path,$$(_OBJ).d)
$$(_OBJ): PRIVATE_MODULE   := $$(LOCAL_MODULE)
$$(_OBJ): PRIVATE_TEXT     := $$(_TEXT)
$$(_OBJ): PRIVATE_CC       := $$(_CC)
$$(_OBJ): PRIVATE_CFLAGS   := $$(_FLAGS)

ifeq ($$(LOCAL_SHORT_COMMANDS),true)
_OPTIONS_LISTFILE := $$(_OBJ).cflags
$$(_OBJ): $$(call generate-list-file,$$(_FLAGS),$$(_OPTIONS_LISTFILE))
$$(_OBJ): PRIVATE_CFLAGS := @$$(call host-path,$$(_OPTIONS_LISTFILE))
$$(_OBJ): $$(_OPTIONS_LISTFILE)
endif

$$(call generate-file-dir,$$(_OBJ))
$$(_OBJ): $$(_SRC) $$(LOCAL_MAKEFILE) $$(NDK_APP_APPLICATION_MK)
	$$(call host-echo-build-step,$$(PRIVATE_ABI),$$(PRIVATE_TEXT)) "$$(PRIVATE_MODULE) <= $$(notdir $$(PRIVATE_SRC))"
	$$(hide) $$(call host-rm,$$(call host-path,$$(PRIVATE_OBJ)))
	$$(hide) $$(PRIVATE_CC) -MMD -MP -MF $$(PRIVATE_DEPS) $$(PRIVATE_CFLAGS) $$(call host-path,$$(PRIVATE_SRC)) -o $$(call host-path,$$(PRIVATE_OBJ))

_JSON_INTERMEDIATE := $$(_OBJ).commands.json

_COMPILE_COMMAND := \
    $$(_CC) $$(_FLAGS) \
    $$(call host-path,$$(_SRC)) \
    -o $$(call host-path,$$(_OBJ)) \

_COMPILE_COMMAND_ARG := $$(_COMPILE_COMMAND)

ifeq ($$(LOCAL_SHORT_COMMANDS),true)
_SUB_COMMANDS_LIST_FILE := $$(_OBJ).commands.list
$$(call generate-list-file,$$(_COMPILE_COMMAND),$$(_SUB_COMMANDS_LIST_FILE))
$$(_JSON_INTERMEDIATE): $$(_SUB_COMMANDS_LIST_FILE)
_COMPILE_COMMAND_ARG := --command-file "$$(_SUB_COMMANDS_LIST_FILE)"
endif

$$(call generate-file-dir,$$(_JSON_INTERMEDIATE))
$$(_JSON_INTERMEDIATE): PRIVATE_CC := $$(_CC)
$$(_JSON_INTERMEDIATE): PRIVATE_SRC := $$(_SRC)
$$(_JSON_INTERMEDIATE): PRIVATE_OBJ := $$(_OBJ)
$$(_JSON_INTERMEDIATE): PRIVATE_CFLAGS := $$(_FLAGS)
$$(_JSON_INTERMEDIATE): PRIVATE_COMPILE_COMMAND_ARG := $$(_COMPILE_COMMAND_ARG)

$$(_JSON_INTERMEDIATE): $$(LOCAL_MAKEFILE) $$(NDK_APP_APPLICATION_MK)
	$$(hide) $$(HOST_PYTHON) $$(BUILD_PY)/dump_compile_commands.py \
        -o $$@ \
        --directory "$$(CURDIR)" \
        --file "$$(call host-path,$$(PRIVATE_SRC))" \
        --object-file "$$(PRIVATE_OBJ)" \
        $$(PRIVATE_COMPILE_COMMAND_ARG)

$$(COMPILE_COMMANDS_JSON): $$(_JSON_INTERMEDIATE)
sub_commands_json += $$(_JSON_INTERMEDIATE)
endef

# This assumes the same things than ev-build-file, but will handle
# the definition of LOCAL_FILTER_ASM as well.
define ev-build-source-file
LOCAL_DEPENDENCY_DIRS += $$(dir $$(_OBJ))
ifndef LOCAL_FILTER_ASM
  # Trivial case: Directly generate an object file
  $$(eval $$(call ev-build-file))
else
  # This is where things get hairy, we first transform
  # the source into an assembler file, send it to the
  # filter, then generate a final object file from it.
  #

  # First, remember the original settings and compute
  # the location of our temporary files.
  #
  _ORG_SRC := $$(_SRC)
  _ORG_OBJ := $$(_OBJ)
  _ORG_FLAGS := $$(_FLAGS)
  _ORG_TEXT  := $$(_TEXT)

  _OBJ_ASM_ORIGINAL := $$(patsubst %$$(TARGET_OBJ_EXTENSION),%.s,$$(_ORG_OBJ))
  _OBJ_ASM_FILTERED := $$(patsubst %$$(TARGET_OBJ_EXTENSION),%.filtered.s,$$(_ORG_OBJ))

  # If the source file is a plain assembler file, we're going to
  # use it directly in our filter.
  ifneq (,$$(filter %.s,$$(_SRC)))
    _OBJ_ASM_ORIGINAL := $$(_SRC)
  endif

  #$$(info SRC=$$(_SRC) OBJ=$$(_OBJ) OBJ_ORIGINAL=$$(_OBJ_ASM_ORIGINAL) OBJ_FILTERED=$$(_OBJ_ASM_FILTERED))

  # We need to transform the source into an assembly file, instead of
  # an object. The proper way to do that depends on the file extension.
  #
  # For C and C++ source files, simply replace the -c by an -S in the
  # compilation command (this forces the compiler to generate an
  # assembly file).
  #
  # For assembler templates (which end in .S), replace the -c with -E
  # to send it to the preprocessor instead.
  #
  # Don't do anything for plain assembly files (which end in .s)
  #
  ifeq (,$$(filter %.s,$$(_SRC)))
    _OBJ   := $$(_OBJ_ASM_ORIGINAL)
    ifneq (,$$(filter %.S,$$(_SRC)))
      _FLAGS := $$(patsubst -c,-E,$$(_ORG_FLAGS))
    else
      _FLAGS := $$(patsubst -c,-S,$$(_ORG_FLAGS))
    endif
    $$(eval $$(call ev-build-file))
  endif

  # Next, process the assembly file with the filter
  $$(_OBJ_ASM_FILTERED): PRIVATE_ABI    := $$(TARGET_ARCH_ABI)
  $$(_OBJ_ASM_FILTERED): PRIVATE_SRC    := $$(_OBJ_ASM_ORIGINAL)
  $$(_OBJ_ASM_FILTERED): PRIVATE_DST    := $$(_OBJ_ASM_FILTERED)
  $$(_OBJ_ASM_FILTERED): PRIVATE_FILTER := $$(LOCAL_FILTER_ASM)
  $$(_OBJ_ASM_FILTERED): PRIVATE_MODULE := $$(LOCAL_MODULE)
  $$(_OBJ_ASM_FILTERED): $$(_OBJ_ASM_ORIGINAL)
	$$(call host-echo-build-step,$$(PRIVATE_ABI),AsmFilter) "$$(PRIVATE_MODULE) <= $$(notdir $$(PRIVATE_SRC))"
	$$(hide) $$(PRIVATE_FILTER) $$(PRIVATE_SRC) $$(PRIVATE_DST)

  # Then, generate the final object, we need to keep assembler-specific
  # flags which look like -Wa,<option>:
  _SRC   := $$(_OBJ_ASM_FILTERED)
  _OBJ   := $$(_ORG_OBJ)
  _FLAGS := $$(filter -Wa%,$$(_ORG_FLAGS)) -c
  _TEXT  := Assembly
  $$(eval $$(call ev-build-file))
endif
endef

# -----------------------------------------------------------------------------
# Template  : ev-compile-c-source
# Arguments : 1: single C source file name (relative to LOCAL_PATH)
#             2: target object file (without path)
# Returns   : None
# Usage     : $(eval $(call ev-compile-c-source,<srcfile>,<objfile>)
# Rationale : Internal template evaluated by compile-c-source and
#             compile-s-source
# -----------------------------------------------------------------------------
define  ev-compile-c-source
_SRC:=$$(call local-source-file-path,$(1))
_OBJ:=$$(LOCAL_OBJS_DIR:%/=%)/$(2)

_FLAGS := \
    $$(GLOBAL_CFLAGS) \
    $$(TARGET_CFLAGS) \
    $$(call get-src-file-target-cflags,$(1)) \
    $$(call host-c-includes,$$(LOCAL_C_INCLUDES) $$(LOCAL_PATH)) \
    $$(NDK_APP_CFLAGS) \
    $$(NDK_APP_CONLYFLAGS) \
    $$(LOCAL_CFLAGS) \
    $$(LOCAL_CONLYFLAGS) \
    -c \

_TEXT := Compile $$(call get-src-file-text,$1)
_CC   := $$(NDK_CCACHE) $$(TARGET_CC)

$$(eval $$(call ev-build-source-file))
endef

# -----------------------------------------------------------------------------
# Template  : ev-compile-s-source
# Arguments : 1: single .S source file name (relative to LOCAL_PATH)
#             2: target object file (without path)
# Returns   : None
# Usage     : $(eval $(call ev-compile-s-source,<srcfile>,<objfile>)
# -----------------------------------------------------------------------------
define  ev-compile-s-source
_SRC:=$$(call local-source-file-path,$(1))
_OBJ:=$$(LOCAL_OBJS_DIR:%/=%)/$(2)

_FLAGS := \
    $$(GLOBAL_CFLAGS) \
    $$(TARGET_CFLAGS) \
    $$(call get-src-file-target-cflags,$(1)) \
    $$(call host-c-includes,$$(LOCAL_C_INCLUDES) $$(LOCAL_PATH)) \
    $$(NDK_APP_CFLAGS) \
    $$(NDK_APP_ASFLAGS) \
    $$(LOCAL_CFLAGS) \
    $$(LOCAL_ASFLAGS) \
    -c \

_TEXT := Compile $$(call get-src-file-text,$1)
_CC   := $$(NDK_CCACHE) $$(TARGET_CC)

$$(eval $$(call ev-build-source-file))
endef

# -----------------------------------------------------------------------------
# Template  : ev-compile-asm-source
# Arguments : 1: single ASM source file name (relative to LOCAL_PATH)
#             2: target object file (without path)
# Returns   : None
# Usage     : $(eval $(call ev-compile-asm-source,<srcfile>,<objfile>)
# Rationale : Internal template evaluated by compile-asm-source
# -----------------------------------------------------------------------------
define  ev-compile-asm-source
_SRC:=$$(call local-source-file-path,$(1))
_OBJ:=$$(LOCAL_OBJS_DIR:%/=%)/$(2)

_FLAGS := $$(call host-c-includes,$$(LOCAL_C_INCLUDES) $$(LOCAL_PATH)) \
          $$(LOCAL_ASMFLAGS) \
          $$(NDK_APP_ASMFLAGS) \
          -I $$(call host-path,$$(SYSROOT_INC)/usr/include) \
          $(subst -isystem,-I,$(SYSROOT_ARCH_INC_ARG)) \
          $$(if $$(filter x86_64, $$(TARGET_ARCH_ABI)), -f elf64, -f elf32 -m x86)

_TEXT := Assemble $$(call get-src-file-text,$1)
_CC   := $$(NDK_CCACHE) $$(TARGET_ASM)

$$(_OBJ): PRIVATE_ABI      := $$(TARGET_ARCH_ABI)
$$(_OBJ): PRIVATE_SRC      := $$(_SRC)
$$(_OBJ): PRIVATE_OBJ      := $$(_OBJ)
$$(_OBJ): PRIVATE_MODULE   := $$(LOCAL_MODULE)
$$(_OBJ): PRIVATE_TEXT     := $$(_TEXT)
$$(_OBJ): PRIVATE_CC       := $$(_CC)
$$(_OBJ): PRIVATE_CFLAGS   := $$(_FLAGS)

ifeq ($$(LOCAL_SHORT_COMMANDS),true)
_OPTIONS_LISTFILE := $$(_OBJ).cflags
$$(_OBJ): $$(call generate-list-file,$$(_FLAGS),$$(_OPTIONS_LISTFILE))
$$(_OBJ): PRIVATE_CFLAGS := @$$(call host-path,$$(_OPTIONS_LISTFILE))
$$(_OBJ): $$(_OPTIONS_LISTFILE)
endif

$$(call generate-file-dir,$$(_OBJ))
$$(_OBJ): $$(_SRC) $$(LOCAL_MAKEFILE) $$(NDK_APP_APPLICATION_MK)
	$$(call host-echo-build-step,$$(PRIVATE_ABI),$$(PRIVATE_TEXT)) "$$(PRIVATE_MODULE) <= $$(notdir $$(PRIVATE_SRC))"
	$$(hide) $$(PRIVATE_CC) $$(PRIVATE_CFLAGS) $$(call host-path,$$(PRIVATE_SRC)) -o $$(call host-path,$$(PRIVATE_OBJ))
endef

# -----------------------------------------------------------------------------
# Function  : compile-c-source
# Arguments : 1: single C source file name (relative to LOCAL_PATH)
#             2: object file
# Returns   : None
# Usage     : $(call compile-c-source,<srcfile>,<objfile>)
# Rationale : Setup everything required to build a single C source file
# -----------------------------------------------------------------------------
compile-c-source = $(eval $(call ev-compile-c-source,$1,$2))

# -----------------------------------------------------------------------------
# Function  : compile-s-source
# Arguments : 1: single Assembly source file name (relative to LOCAL_PATH)
#             2: object file
# Returns   : None
# Usage     : $(call compile-s-source,<srcfile>,<objfile>)
# Rationale : Setup everything required to build a single Assembly source file
# -----------------------------------------------------------------------------
compile-s-source = $(eval $(call ev-compile-s-source,$1,$2))

# -----------------------------------------------------------------------------
# Function  : compile-asm-source
# Arguments : 1: single Assembly source file name (relative to LOCAL_PATH)
#             2: object file
# Returns   : None
# Usage     : $(call compile-asm-source,<srcfile>,<objfile>)
# Rationale : Setup everything required to build a single Assembly source file
# -----------------------------------------------------------------------------
compile-asm-source = $(eval $(call ev-compile-asm-source,$1,$2))

# -----------------------------------------------------------------------------
# Template  : ev-compile-cpp-source
# Arguments : 1: single C++ source file name (relative to LOCAL_PATH)
#             2: target object file (without path)
# Returns   : None
# Usage     : $(eval $(call ev-compile-cpp-source,<srcfile>,<objfile>)
# Rationale : Internal template evaluated by compile-cpp-source
# -----------------------------------------------------------------------------

define  ev-compile-cpp-source
_SRC:=$$(call local-source-file-path,$(1))
_OBJ:=$$(LOCAL_OBJS_DIR:%/=%)/$(2)
_FLAGS := \
    $$(GLOBAL_CXXFLAGS) \
    $$(TARGET_CXXFLAGS) \
    $$(call get-src-file-target-cflags,$(1)) \
    $$(call host-c-includes, $$(LOCAL_C_INCLUDES) $$(LOCAL_PATH)) \
    $$(NDK_APP_CFLAGS) \
    $$(NDK_APP_CPPFLAGS) \
    $$(NDK_APP_CXXFLAGS) \
    $$(LOCAL_CFLAGS) \
    $$(LOCAL_CPPFLAGS) \
    $$(LOCAL_CXXFLAGS) \
    -c \

_CC   := $$(NDK_CCACHE) $$(TARGET_CXX)
_TEXT := Compile++ $$(call get-src-file-text,$1)

$$(eval $$(call ev-build-source-file))
endef

# -----------------------------------------------------------------------------
# Function  : compile-cpp-source
# Arguments : 1: single C++ source file name (relative to LOCAL_PATH)
#           : 2: object file name
# Returns   : None
# Usage     : $(call compile-cpp-source,<srcfile>)
# Rationale : Setup everything required to build a single C++ source file
# -----------------------------------------------------------------------------
compile-cpp-source = $(eval $(call ev-compile-cpp-source,$1,$2))

# clang-tidy doesn't recognize every flag that clang does. This is unlikely to
# be a complete list, but we can populate this with the ones we know to avoid
# issues with clang-diagnostic-unused-command-line-argument.
CLANG_TIDY_UNKNOWN_CFLAGS := \
    -Wa,% \

sanitize_tidy_cflags = $(filter-out $(CLANG_TIDY_UNKNOWN_CFLAGS),$1)

# Generates rules to check a source file with clang-tidy.
#
# This rule will depend on the source file, the Android.mk, the Application.mk,
# and the object file that this source will be compiled into. The object file is
# a dependency to ensure that we re-run clang-tidy if a header file included by
# the source is changed, not just if the file itself changes.
#
# To avoid unnecessarily re-running this rule, we touch a foo.c.tidy file as the
# output of this rule. Calling this function automatically appends the .tidy
# file as a dependency of clang_tidy_rules, a phony rule that is a dependency of
# the all rule.
define ev-clang-tidy
$$(_OUT): PRIVATE_ABI        := $$(TARGET_ARCH_ABI)
$$(_OUT): PRIVATE_SRC        := $$(_SRC)
$$(_OUT): PRIVATE_OUT        := $$(_OUT)
$$(_OUT): PRIVATE_OBJ        := $$(_OBJ)
$$(_OUT): PRIVATE_MODULE     := $$(LOCAL_MODULE)
$$(_OUT): PRIVATE_TEXT       := $$(_TEXT)
$$(_OUT): PRIVATE_CC         := $$(_CC)
$$(_OUT): PRIVATE_CFLAGS     := $$(_FLAGS)
$$(_OUT): PRIVATE_TIDY_FLAGS := $$(_TIDY_FLAGS)

ifeq ($$(LOCAL_SHORT_COMMANDS),true)
_OPTIONS_LISTFILE := $$(_OUT).cflags
$$(_OUT): $$(call generate-list-file,$$(_FLAGS),$$(_OPTIONS_LISTFILE))
$$(_OUT): PRIVATE_CFLAGS := @$$(call host-path,$$(_OPTIONS_LISTFILE))
$$(_OUT): $$(_OPTIONS_LISTFILE)
endif

clang_tidy_rules: $$(_OUT)

$$(call generate-file-dir,$$(_OUT))
$$(_OUT): $$(_SRC) $$(LOCAL_MAKEFILE) $$(NDK_APP_APPLICATION_MK) $$(_OBJ)
	$$(hide) $$(call host-rm,$$(PRIVATE_OUT))
	$$(call host-echo-build-step,$$(PRIVATE_ABI),$$(PRIVATE_TEXT)) "$$(PRIVATE_MODULE) <= $$(notdir $$(PRIVATE_SRC))"
	$$(hide) $$(CLANG_TIDY) $$(call host-path,$$(PRIVATE_SRC)) $$(PRIVATE_TIDY_FLAGS) -- $$(PRIVATE_CFLAGS)
	$$(hide) $$(call generate-empty-file,$$(PRIVATE_OUT))
endef

# -----------------------------------------------------------------------------
# Template  : ev-clang-tidy-c
# Arguments : 1: Single C source file name (relative to LOCAL_PATH)
#             2: obj file for the source. Used for tracking header dependencies.
# Returns   : None
# Usage     : $(eval $(call ev-clang-tidy-c,<srcfile>)
# -----------------------------------------------------------------------------

define  ev-clang-tidy-c
_SRC := $$(call local-source-file-path,$(1))
_OUT := $$(LOCAL_OBJS_DIR:%/=%)/$(1).tidy
_OBJ := $$(LOCAL_OBJS_DIR:%/=%)/$(2)
_TIDY_FLAGS := $$(NDK_APP_CLANG_TIDY_FLAGS) $$(LOCAL_CLANG_TIDY_FLAGS)

_FLAGS := \
    $$(call sanitize_tidy_cflags,\
    $$(GLOBAL_CFLAGS) \
    $$(TARGET_CFLAGS) \
    $$(call get-src-file-target-cflags,$(1)) \
    $$(call host-c-includes,$$(LOCAL_C_INCLUDES) $$(LOCAL_PATH)) \
    $$(NDK_APP_CFLAGS) \
    $$(NDK_APP_CONLYFLAGS) \
    $$(LOCAL_CFLAGS) \
    $$(LOCAL_CONLYFLAGS) \
    -c \
)

_TEXT := clang-tidy $$(call get-src-file-text,$1)

$$(eval $$(call ev-clang-tidy))
endef

# -----------------------------------------------------------------------------
# Function  : clang-tidy-c
# Arguments : 1: single C source file name (relative to LOCAL_PATH)
#             2: obj file for the source. Used for tracking header dependencies.
# Returns   : None
# Usage     : $(call clang-tidy-c,<srcfile>)
# -----------------------------------------------------------------------------
clang-tidy-c = $(eval $(call ev-clang-tidy-c,$1,$2))

# -----------------------------------------------------------------------------
# Template  : ev-clang-tidy-cpp
# Arguments : 1: single C++ source file name (relative to LOCAL_PATH)
#             2: obj file for the source. Used for tracking header dependencies.
# Returns   : None
# Usage     : $(eval $(call ev-clang-tidy-cpp,<srcfile>)
# -----------------------------------------------------------------------------

define  ev-clang-tidy-cpp
_SRC := $$(call local-source-file-path,$(1))
_OUT := $$(LOCAL_OBJS_DIR:%/=%)/$(1).tidy
_OBJ := $$(LOCAL_OBJS_DIR:%/=%)/$(2)
_TIDY_FLAGS := $$(NDK_APP_CLANG_TIDY_FLAGS) $$(LOCAL_CLANG_TIDY_FLAGS)

_FLAGS := \
    $$(call sanitize_tidy_cflags,\
    $$(GLOBAL_CXXFLAGS) \
    $$(TARGET_CXXFLAGS) \
    $$(call get-src-file-target-cflags,$(1)) \
    $$(call host-c-includes, $$(LOCAL_C_INCLUDES) $$(LOCAL_PATH)) \
    $$(NDK_APP_CFLAGS) \
    $$(NDK_APP_CPPFLAGS) \
    $$(NDK_APP_CXXFLAGS) \
    $$(LOCAL_CFLAGS) \
    $$(LOCAL_CPPFLAGS) \
    $$(LOCAL_CXXFLAGS) \
    -c\
)

_TEXT := clang-tidy $$(call get-src-file-text,$1)

$$(eval $$(call ev-clang-tidy))
endef

# -----------------------------------------------------------------------------
# Function  : clang-tidy-cpp
# Arguments : 1: single C++ source file name (relative to LOCAL_PATH)
#             2: obj file for the source. Used for tracking header dependencies.
# Returns   : None
# Usage     : $(call compile-cpp-source,<srcfile>)
# -----------------------------------------------------------------------------
clang-tidy-cpp = $(eval $(call ev-clang-tidy-cpp,$1,$2))

#
#  Module imports
#

# Initialize import list
import-init = $(eval __ndk_import_dirs :=)

# Add an optional single directory to the list of import paths
#
import-add-path-optional = \
  $(if $(strip $(wildcard $1)),\
    $(call ndk_log,Adding import directory: $1)\
    $(eval __ndk_import_dirs += $1)\
  )\

# Add a directory to the list of import paths
# This will warn if the directory does not exist
#
import-add-path = \
  $(if $(strip $(wildcard $1)),\
    $(call ndk_log,Adding import directory: $1)\
    $(eval __ndk_import_dirs += $1)\
  ,\
    $(call __ndk_info,WARNING: Ignoring unknown import directory: $1)\
  )\

import-find-module = $(strip \
      $(eval __imported_module :=)\
      $(foreach __import_dir,$(__ndk_import_dirs),\
        $(if $(__imported_module),,\
          $(call ndk_log,  Probing $(__import_dir)/$1/Android.mk)\
          $(if $(strip $(wildcard $(__import_dir)/$1/Android.mk)),\
            $(eval __imported_module := $(__import_dir)/$1)\
          )\
        )\
      )\
      $(__imported_module)\
    )

# described in docs/IMPORT-MODULE.TXT
# $1: tag name for the lookup
#
# Small technical note on __ndk_import_depth: we use this variable to
# record the depth of recursive import-module calls. The variable is
# initially empty, and we append a "x" to it each time import-module is
# called. I.e. for three recursive calls to import-module, we would get
# the values:
#
#   first call:   x
#   second call:  xx
#   third call:   xxx
#
# This is used in module-add to add the top-level modules (i.e. those
# that are not added with import-module) to __ndk_top_modules, corresponding
# to the default list of wanted modules (see setup-toolchain.mk).
#
import-module = \
    $(eval __import_tag := $(strip $1))\
    $(if $(call seq,$(words $(__import_tag)),1),,\
      $(call __ndk_info,$(call local-makefile): Cannot import module with spaces in tag: '$(__import_tag)')\
    )\
    $(if $(call set_is_member,$(__ndk_import_list),$(__import_tag)),\
      $(call ndk_log,Skipping duplicate import for module with tag '$(__import_tag)')\
    ,\
      $(call ndk_log,Looking for imported module with tag '$(__import_tag)')\
      $(eval __imported_path := $(call import-find-module,$(__import_tag)))\
      $(if $(__imported_path),\
        $(call ndk_log,    Found in $(__imported_path))\
        $(eval __ndk_import_depth := $(__ndk_import_depth)x) \
        $(eval __ndk_import_list := $(call set_insert,$(__ndk_import_list),$(__import_tag)))\
        $(eval include $(__imported_path)/Android.mk)\
        $(eval __ndk_import_depth := $(__ndk_import_depth:%x=%))\
      ,\
        $(call __ndk_info,$(call local-makefile): Cannot find module with tag '$(__import_tag)' in import path)\
        $(call __ndk_info,Are you sure your NDK_MODULE_PATH variable is properly defined ?)\
        $(call __ndk_info,The following directories were searched:)\
        $(for __import_dir,$(__ndk_import_dirs),\
          $(call __ndk_info,    $(__import_dir))\
        )\
        $(call __ndk_error,Aborting.)\
      )\
   )

# Only used for debugging
#
import-debug = \
    $(info IMPORT DIRECTORIES:)\
    $(foreach __dir,$(__ndk_import_dirs),\
      $(info -- $(__dir))\
    )\

#
#  Module classes
#
NDK_MODULE_CLASSES :=

# Register a new module class
# $1: class name (e.g. STATIC_LIBRARY)
# $2: optional file prefix (e.g. 'lib')
# $3: optional file suffix (e.g. '.so')
#
module-class-register = \
    $(eval NDK_MODULE_CLASSES += $1) \
    $(eval NDK_MODULE_CLASS.$1.FILE_PREFIX := $2) \
    $(eval NDK_MODULE_CLASS.$1.FILE_SUFFIX := $3) \
    $(eval NDK_MODULE_CLASS.$1.INSTALLABLE := $(false)) \

# Same a module-class-register, for installable modules
#
# An installable module is one that will be copied to $PROJECT/libs/<abi>/
# during the NDK build.
#
# $1: class name
# $2: optional file prefix
# $3: optional file suffix
#
module-class-register-installable = \
    $(call module-class-register,$1,$2,$3) \
    $(eval NDK_MODULE_CLASS.$1.INSTALLABLE := $(true))

# Returns $(true) if $1 is a valid/registered LOCAL_MODULE_CLASS value
#
module-class-check = $(call set_is_member,$(NDK_MODULE_CLASSES),$1)

# Returns $(true) if $1 corresponds to an installable module class
#
module-class-is-installable = $(if $(NDK_MODULE_CLASS.$1.INSTALLABLE),$(true),$(false))

# Returns $(true) if $1 corresponds to a copyable prebuilt module class
#
module-class-is-copyable = $(if $(call seq,$1,PREBUILT_SHARED_LIBRARY),$(true),$(false))

#
# Register valid module classes
#

# static libraries:
# <foo> -> lib<foo>.a by default
$(call module-class-register,STATIC_LIBRARY,lib,$(TARGET_LIB_EXTENSION))

# shared libraries:
# <foo> -> lib<foo>.so
# a shared library is installable.
$(call module-class-register-installable,SHARED_LIBRARY,lib,$(TARGET_SONAME_EXTENSION))

# executable
# <foo> -> <foo>
# an executable is installable.
$(call module-class-register-installable,EXECUTABLE,,)

# prebuilt shared library
# <foo> -> <foo>  (we assume it is already well-named)
# it is installable
$(call module-class-register-installable,PREBUILT_SHARED_LIBRARY,,)

# prebuilt static library
# <foo> -> <foo> (we assume it is already well-named)
$(call module-class-register,PREBUILT_STATIC_LIBRARY,,)

#
# C++ STL support
#

# The list of registered STL implementations we support
NDK_STL_LIST := c++_shared c++_static system none


# Called to check that the value of APP_STL is a valid one.
# $1: STL name as it apperas in APP_STL (e.g. 'system')
#
ndk-stl-check = \
    $(if $(call set_is_member,$(NDK_STL_LIST),$1),,\
        $(call __ndk_info,Invalid APP_STL value: $1)\
        $(call __ndk_info,Please use one of the following instead: $(NDK_STL_LIST))\
        $(call __ndk_error,Aborting))


ifneq (,$(NDK_UNIT_TESTS))
$(call ndk-run-all-tests)
endif
