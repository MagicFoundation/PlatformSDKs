@echo off
setlocal

rem This is checked in build-local.mk... but make on windows doesn't handle
rem LAST_MAKEFILE correctly when the makefile is in a directory with spaces
rem anyway, so that defense doesn't work either.
rem https://github.com/android/ndk/issues/1400
rem https://stackoverflow.com/a/29057742/632035
for /f "tokens=2" %%a in ("%~dp0") do (
    echo ERROR: NDK path cannot contain spaces
    exit /b 1
)

rem Unset PYTHONPATH and PYTHONHOME to prevent the user's environment from
rem affecting the Python that we invoke.
rem See https://github.com/googlesamples/vulkan-basic-samples/issues/25
set PYTHONHOME=
set PYTHONPATH=
set NDK_ROOT=%~dp0..
set PREBUILT_PATH=%NDK_ROOT%\prebuilt\windows-x86_64
"%PREBUILT_PATH%\bin\make.exe" -O -f "%NDK_ROOT%\build\core\build-local.mk" SHELL=cmd %*
