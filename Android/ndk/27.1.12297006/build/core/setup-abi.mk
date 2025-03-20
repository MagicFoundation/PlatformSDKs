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

# this file is included multiple times by build/core/setup-app.mk
#

$(call ndk_log,Building application '$(NDK_APP_NAME)' for ABI '$(TARGET_ARCH_ABI)')

TARGET_ARCH := $(strip $(NDK_ABI.$(TARGET_ARCH_ABI).arch))
ifndef TARGET_ARCH
    $(call __ndk_info,ERROR: The $(TARGET_ARCH_ABI) ABI has no associated architecture!)
    $(call __ndk_error,Aborting...)
endif

TARGET_OUT := $(NDK_APP_OUT)/$(_app)/$(TARGET_ARCH_ABI)

TARGET_PLATFORM_LEVEL := $(APP_PLATFORM_LEVEL)

# Pull up the minSdkVersion for this ABI if it is higher than the user's
# APP_PLATFORM. A warning will be separately emitted in setup-app-platform.mk if
# the user's APP_PLATFORM is too low for the NDK overall.
MIN_OS_FOR_TARGET := $(NDK_ABI_${TARGET_ARCH_ABI}_MIN_OS_VERSION)
ifneq ($(call lt,$(TARGET_PLATFORM_LEVEL),$(MIN_OS_FOR_TARGET)),)
    TARGET_PLATFORM_LEVEL := $(MIN_OS_FOR_TARGET)
endif

# Not used by ndk-build, but are documented for use by Android.mk files.
TARGET_PLATFORM := android-$(TARGET_PLATFORM_LEVEL)
TARGET_ABI := $(TARGET_PLATFORM)-$(TARGET_ARCH_ABI)

# Separate the debug and release objects. This prevents rebuilding
# everything when you switch between these two modes. For projects
# with lots of C++ sources, this can be a considerable time saver.
ifeq ($(NDK_APP_OPTIM),debug)
TARGET_OBJS := $(TARGET_OUT)/objs-debug
else
TARGET_OBJS := $(TARGET_OUT)/objs
endif

include $(BUILD_SYSTEM)/setup-toolchain.mk
