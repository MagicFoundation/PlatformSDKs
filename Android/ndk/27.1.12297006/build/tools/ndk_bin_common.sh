#!/usr/bin/env bash
#
# Copyright (C) 2022 The Android Open Source Project
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

HOST_OS=$(uname -s)
case $HOST_OS in
  Darwin) HOST_OS=darwin;;
  Linux) HOST_OS=linux;;
  FreeBsd) HOST_OS=freebsd;;
  CYGWIN*|*_NT-*) HOST_OS=cygwin;;
  *) echo "ERROR: Unknown host operating system: $HOST_OS"
     exit 1
esac

HOST_ARCH=$(uname -m)
case $HOST_ARCH in
  arm64) HOST_ARCH=arm64;;
  i?86) HOST_ARCH=x86;;
  x86_64|amd64) HOST_ARCH=x86_64;;
  *) echo "ERROR: Unknown host CPU architecture: $HOST_ARCH"
     exit 1
esac

HOST_TAG=$HOST_OS-$HOST_ARCH

if [ $HOST_TAG = darwin-arm64 ]; then
  # The NDK ships universal arm64+x86_64 binaries in the darwin-x86_64
  # directory.
  HOST_TAG=darwin-x86_64
fi

if [ $HOST_OS = cygwin ]; then
  ANDROID_NDK_PYTHON=$ANDROID_NDK_ROOT/toolchains/llvm/prebuilt/windows-x86_64/python3/python.exe
else
  ANDROID_NDK_PYTHON=$ANDROID_NDK_ROOT/toolchains/llvm/prebuilt/$HOST_TAG/python3/bin/python3
fi
