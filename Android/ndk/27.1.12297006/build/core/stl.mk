#
# Copyright (C) 2023 The Android Open Source Project
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

# Interprets APP_STL to configure default cflags/ldflags and install rules for
# libc++ runtime libraries as necessary.

ifneq (,$(call module_needs_clangxx,$(LOCAL_MODULE)))

ifeq ($(APP_STL),none)
LOCAL_CPPFLAGS += -nostdinc++
LOCAL_LDFLAGS += -nostdlib++
else ifeq ($(APP_STL),system)
# TODO: Actually use the system STL headers for that mode or remove.
#
# I'm not sure how long this has been broken, but released NDKs do not use the
# bionic C++ headers when APP_STL=system, they use the libc++ headers. That's
# almost certainly unintentional.
#
# There may not actually be any compatibility issues with this because bionic's
# libstdc++ only provides new and delete anyway (the rest of the behavior is
# just headers that re-expose C APIs in the std namespace). We could choose to
# delete bionic's headers and keep this "bug" instead.

# LOCAL_CPPFLAGS += -stdlib=libstdc++
# LOCAL_LDFLAGS += -stdlib=libstdc++

# TODO: Remove when https://reviews.llvm.org/D55856 is merged.
#
# The system STL Android.mk will export -lstdc++, but the Clang driver will
# helpfully rewrite -lstdc++ to whatever the default C++ stdlib linker
# arguments are, except in the presence of -nostdlib and -nodefaultlibs.
# That part of the driver does not account for -nostdlib++. We can fix the
# behavior by using -stdlib=libstdc++ so it rewrites -lstdc++ to -lstdc++
# instead of -lc++.
LOCAL_LDFLAGS += -stdlib=libstdc++

ifneq (,$(call module-has-c++-features,$(LOCAL_MODULE),rtti exceptions))
	LOCAL_LDLIBS += -lc++abi
endif

else ifeq ($(APP_STL),c++_static)
LOCAL_LDFLAGS += -static-libstdc++
endif

# Else c++_shared, and no flags are needed. Shared libc++ is the default
# behavior for Android targets in Clang.
#
# Invalid values will be checked by ndk-stl-check.

endif
