# Not bothering to check if there's actually any C++ code in the app. c++_shared
# is not the default, so if someone has set it explicitly we might as well do
# what they say.
ifeq ($(APP_STL),c++_shared)

NDK_LIBCXX_TARGET := $(NDK_APP_DST_DIR)/libc++_shared.so
NDK_LIBCXX_LIB_PATH := $(SYSROOT_LIB_DIR)/libc++_shared.so

installed_modules: $(NDK_LIBCXX_TARGET)

$(NDK_LIBCXX_TARGET): PRIVATE_ABI := $(TARGET_ARCH_ABI)
$(NDK_LIBCXX_TARGET): PRIVATE_NAME := Install
$(NDK_LIBCXX_TARGET): PRIVATE_SRC := $(NDK_LIBCXX_LIB_PATH)
$(NDK_LIBCXX_TARGET): PRIVATE_DST := $(NDK_LIBCXX_TARGET)

$(call generate-file-dir,$(NDK_LIBCXX_TARGET))

$(NDK_LIBCXX_TARGET): clean-installed-binaries
	$(call host-echo-build-step,$(PRIVATE_ABI),$(PRIVATE_NAME) "$(call pretty-dir,$(PRIVATE_DST))")
	$(hide) $(call host-install,$(PRIVATE_SRC),$(PRIVATE_DST))

endif