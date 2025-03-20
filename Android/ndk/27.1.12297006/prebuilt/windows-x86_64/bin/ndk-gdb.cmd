@echo off
setlocal
set ANDROID_NDK_PYTHON=%~dp0..\..\..\toolchains\llvm\prebuilt\windows-x86_64\python3\python.exe
set SHELL=cmd
"%ANDROID_NDK_PYTHON%" -u "%~dp0ndkgdb.pyz" %*
