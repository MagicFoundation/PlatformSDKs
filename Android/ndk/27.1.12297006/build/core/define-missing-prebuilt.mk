#
# Copyright (C) 2021 The Android Open Source Project
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

# https://github.com/android/ndk/issues/1559
#
# When LOCAL_ALLOW_MISSING_PREBUILT is true we avoid checking for missing
# prebuilt libraries early and instead let the copy rule fail. This leads to a
# worse diagnostic but supports the use case where AGP runs `ndk-build -n` to
# get the build commands during sync time and the "pre" built library is
# actually built by another module that hasn't been built yet.
#
# This phony target is only generated when the library actually is missing (see
# the callsite in prebuilt-library.mk).
.PHONY: $(prebuilt)
