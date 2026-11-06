@echo off
rem Copyright (C) 2026 The Android Open Source Project
rem
rem Licensed under the Apache License, Version 2.0 (the "License");
rem you may not use this file except in compliance with the License.
rem You may obtain a copy of the License at
rem
rem      http://www.apache.org/licenses/LICENSE-2.0
rem
rem Unless required by applicable law or agreed to in writing, software
rem distributed under the License is distributed on an "AS IS" BASIS,
rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
rem See the License for the specific language governing permissions and
rem limitations under the License.

setlocal enabledelayedexpansion

set SCRIPT_DIR=%~dp0

echo WARNING: The SDK Manager CLI tool (sdkmanager) is deprecated. Android CLI will be used instead.>&2
echo The 'android' binary can also be found in the cmdline-tools directory, and 'android sdk' is the replacement for 'sdkmanager'.>&2
echo To learn more about the Android CLI and how to use it, see the documentation (https://d.android.com/tools/agents/android-cli)>&2
echo.>&2

if "%~1"=="" goto show_help_error
if "%~1"=="--help" goto show_help_success
if "%~1"=="-h" goto show_help_success
if "%~1"=="--version" goto show_version

set SDK_ROOT=

set MODE=install
set SPECIAL_CMD=
set LICENSES_CONFIGURED=
set PROXY_CONFIGURED=
set PACKAGES=
set EXTRA_ARGS=

:parse_loop
if "%~1"=="" goto parse_done

set ARG=%~1
if "%ARG%"=="--help" goto show_help_success
if "%ARG%"=="-h" goto show_help_success
if "%ARG%"=="--version" goto show_version
if "%ARG%"=="--list" (
    set SPECIAL_CMD=list --all
    shift
    goto parse_loop
)
if "%ARG%"=="--list_installed" (
    set SPECIAL_CMD=list
    shift
    goto parse_loop
)
if "%ARG%"=="--update" (
    set SPECIAL_CMD=update
    shift
    goto parse_loop
)
if "%ARG%"=="--licenses" (
    echo Warning: The --licenses option is no longer needed.>&2
    set LICENSES_CONFIGURED=true
    shift
    goto parse_loop
)
if "%ARG%"=="--uninstall" (
    set MODE=remove
    shift
    goto parse_loop
)
if "%ARG%"=="--install" (
    set MODE=install
    shift
    goto parse_loop
)
if "%ARG:~0,11%"=="--sdk_root=" (
    set SDK_ROOT=%ARG:~11%
    set SDK_ROOT=!SDK_ROOT:"=!
    shift
    goto parse_loop
)
if "%ARG%"=="--sdk_root" (
    set SDK_ROOT=%~2
    set SDK_ROOT=!SDK_ROOT:"=!
    shift
    shift
    goto parse_loop
)
if "%ARG:~0,10%"=="--channel=" (
    set CH=%ARG:~10%
    call :process_channel "!CH!"
    shift
    goto parse_loop
)
if "%ARG%"=="--channel" (
    call :process_channel "%~2"
    shift
    shift
    goto parse_loop
)
if "%ARG%"=="--include_obsolete" (
    echo Warning: Flag %ARG% is no longer supported. Ignoring.>&2
    shift
    goto parse_loop
)
if "%ARG%"=="--newer" (
    echo Warning: Flag %ARG% is no longer supported. Ignoring.>&2
    shift
    goto parse_loop
)
if "%ARG%"=="--no_https" (
    echo Warning: Flag %ARG% is no longer supported. Ignoring.>&2
    shift
    goto parse_loop
)
if "%ARG%"=="--verbose" (
    echo Warning: Flag %ARG% is no longer supported. Ignoring.>&2
    shift
    goto parse_loop
)
if "%ARG:~0,8%"=="--proxy=" (
    set PROXY_CONFIGURED=true
    shift
    goto parse_loop
)
if "%ARG%"=="--proxy" (
    set PROXY_CONFIGURED=true
    shift
    shift
    goto parse_loop
)
if "%ARG:~0,13%"=="--proxy_host=" (
    set PROXY_CONFIGURED=true
    shift
    goto parse_loop
)
if "%ARG%"=="--proxy_host" (
    set PROXY_CONFIGURED=true
    shift
    shift
    goto parse_loop
)
if "%ARG:~0,13%"=="--proxy_port=" (
    set PROXY_CONFIGURED=true
    shift
    goto parse_loop
)
if "%ARG%"=="--proxy_port" (
    set PROXY_CONFIGURED=true
    shift
    shift
    goto parse_loop
)
if "%ARG%"=="--no_proxy" (
    set PROXY_CONFIGURED=true
    shift
    goto parse_loop
)
if "%ARG%"=="--package_file" (
    call :parse_package_file "%~2"
    shift
    shift
    goto parse_loop
)
if "%ARG:~0,15%"=="--package_file=" (
    set PKG_FILE=%ARG:~15%
    call :parse_package_file "!PKG_FILE!"
    shift
    goto parse_loop
)

if "%ARG:~0,1%"=="-" (
    echo Unknown option: '%ARG%'>&2
    goto show_help_error
) else (
    call :add_package "!ARG!"
)
shift
goto parse_loop

:add_package
set PKG=%~1
set PKG=!PKG:;=/!
if "!PKG: =!" neq "!PKG!" set PKG="!PKG!"
set PACKAGES=!PACKAGES! !PKG!
exit /b 0

:parse_package_file
set PKG_FILE=%~1
for /f "usebackq eol=# delims=" %%L in ("!PKG_FILE!") do (
    set LINE=%%L
    if not "!LINE!"=="" call :add_package "!LINE!"
)
exit /b 0

:process_channel
set CH=%~1
if "!CH!"=="1" set EXTRA_ARGS=!EXTRA_ARGS! --beta
if /i "!CH!"=="beta" set EXTRA_ARGS=!EXTRA_ARGS! --beta
if "!CH!"=="2" (
    echo Warning: Channel 2 (Dev^) is not discretely supported; mapping to --canary.>&2
    set EXTRA_ARGS=!EXTRA_ARGS! --canary
)
if /i "!CH!"=="dev" (
    echo Warning: Channel 2 (Dev^) is not discretely supported; mapping to --canary.>&2
    set EXTRA_ARGS=!EXTRA_ARGS! --canary
)
if "!CH!"=="3" set EXTRA_ARGS=!EXTRA_ARGS! --canary
if /i "!CH!"=="canary" set EXTRA_ARGS=!EXTRA_ARGS! --canary
exit /b 0

:parse_done
if "!PROXY_CONFIGURED!"=="true" (
    echo Warning: Proxy options are no longer needed; using default system proxy configuration.>&2
)

if defined REPO_OS_OVERRIDE (
    set "ADD_PLATFORM="
    if "!SPECIAL_CMD!"=="update" set "ADD_PLATFORM=true"
    if "!SPECIAL_CMD!"=="" if "!MODE!"=="install" set "ADD_PLATFORM=true"
    if "!ADD_PLATFORM!"=="true" (
        set "HOST_ARCH=x86_64"
        if /i "!PROCESSOR_ARCHITECTURE!"=="ARM64" set "HOST_ARCH=arm64"
        if /i "!PROCESSOR_ARCHITEW6432!"=="ARM64" set "HOST_ARCH=arm64"
        if /i "!PROCESSOR_ARCHITECTURE!"=="x86" if not defined PROCESSOR_ARCHITEW6432 set "HOST_ARCH=x86"
        set "OVERRIDE_VAL=!REPO_OS_OVERRIDE!"
        set "OVERRIDE_VAL=!OVERRIDE_VAL:-=_!"
        if "!OVERRIDE_VAL:_=!"=="!OVERRIDE_VAL!" (
            set EXTRA_ARGS=!EXTRA_ARGS! --platform=!OVERRIDE_VAL!_!HOST_ARCH!
        ) else (
            set EXTRA_ARGS=!EXTRA_ARGS! --platform=!OVERRIDE_VAL!
        )
    )
)

if "!SPECIAL_CMD!"=="" if "!PACKAGES!"=="" (
    if "!LICENSES_CONFIGURED!"=="true" exit /b 0
    goto show_help_error
)

call :resolve_sdk_root
if errorlevel 1 exit /b 1

if not "%SPECIAL_CMD%"=="" (
    call :run_android_cli %SPECIAL_CMD%%EXTRA_ARGS%
    exit /b !ERRORLEVEL!
)

call :run_android_cli %MODE%%EXTRA_ARGS%%PACKAGES%
exit /b !ERRORLEVEL!

:run_android_cli
if not "%ANDROID_CLI_BIN%"=="" (
    call "%ANDROID_CLI_BIN%" --sdk="!SDK_ROOT!" sdk %*
    exit /b !ERRORLEVEL!
)
if exist "%SCRIPT_DIR%android.bat" (
    call "%SCRIPT_DIR%android.bat" --sdk="!SDK_ROOT!" sdk %*
    exit /b !ERRORLEVEL!
)
"%SCRIPT_DIR%android.exe" --sdk="!SDK_ROOT!" sdk %*
exit /b !ERRORLEVEL!

:resolve_sdk_root
if not "%SDK_ROOT%"=="" exit /b 0
for %%I in ("%SCRIPT_DIR%..\..") do (
    set PARENT2_NAME=%%~nxI
    set PARENT2_PATH=%%~fI
)
for %%I in ("%SCRIPT_DIR%..\..\..") do set PARENT3_PATH=%%~fI

if /i "%PARENT2_NAME%"=="cmdline-tools" (
    set SDK_ROOT=%PARENT3_PATH%
    exit /b 0
)
echo Error: Could not determine SDK root.>&2
echo Error: Either specify it explicitly with --sdk_root= or move this package into its expected location: ^<sdk^>\cmdline-tools\latest\>&2
exit /b 1

:show_version
set "CLI_VER="
if not "%ANDROID_CLI_BIN%"=="" (
    for /f "delims=" %%A in ('"%ANDROID_CLI_BIN%" --version 2^>nul') do set "CLI_VER=%%A"
)
if "!CLI_VER!"=="" if exist "%SCRIPT_DIR%android.bat" (
    for /f "delims=" %%A in ('"%SCRIPT_DIR%android.bat" --version 2^>nul') do set "CLI_VER=%%A"
)
if "!CLI_VER!"=="" if exist "%SCRIPT_DIR%android.exe" (
    for /f "delims=" %%A in ('"%SCRIPT_DIR%android.exe" --version 2^>nul') do set "CLI_VER=%%A"
)
if not "!CLI_VER!"=="" (
    echo !CLI_VER! ^(Android CLI^)
    exit /b 0
)
echo unknown (Android CLI)
exit /b 0

:show_help_success
set HELP_STREAM=
set HELP_EXIT=0
goto print_help

:show_help_error
set HELP_STREAM=^>^&2
set HELP_EXIT=1
goto print_help

:print_help
echo Usage:%HELP_STREAM%
echo   sdkmanager [--uninstall] [^<common args^>] [--package_file=^<file^>] [^<packages^>...]%HELP_STREAM%
echo   sdkmanager --update [^<common args^>]%HELP_STREAM%
echo   sdkmanager --list [^<common args^>]%HELP_STREAM%
echo   sdkmanager --list_installed [^<common args^>]%HELP_STREAM%
echo   sdkmanager --version%HELP_STREAM%
echo.%HELP_STREAM%
echo With --install (optional), installs or updates packages.%HELP_STREAM%
echo     By default, the listed packages are installed or (if already installed)%HELP_STREAM%
echo     updated to the latest version.%HELP_STREAM%
echo With --uninstall, uninstall the listed packages.%HELP_STREAM%
echo.%HELP_STREAM%
echo     ^<package^> is a sdk-style path (e.g. "build-tools/23.0.0" or%HELP_STREAM%
echo              "platforms/android-23").%HELP_STREAM%
echo     ^<package-file^> is a text file where each line is a sdk-style path%HELP_STREAM%
echo                    of a package to install or uninstall.%HELP_STREAM%
echo     Multiple --package_file arguments may be specified in combination%HELP_STREAM%
echo     with explicit paths.%HELP_STREAM%
echo.%HELP_STREAM%
echo With --update, all installed packages are updated to the latest version.%HELP_STREAM%
echo.%HELP_STREAM%
echo With --list, all installed and available packages are printed out.%HELP_STREAM%
echo.%HELP_STREAM%
echo With --list_installed, all installed packages are printed out.%HELP_STREAM%
echo.%HELP_STREAM%
echo With --version, prints the current version of sdkmanager.%HELP_STREAM%
echo.%HELP_STREAM%
echo Common Arguments:%HELP_STREAM%
echo     --sdk_root=^<sdkRootPath^>: Use the specified SDK root instead of the SDK%HELP_STREAM%
echo                               containing this tool%HELP_STREAM%
echo.%HELP_STREAM%
echo     --channel=^<channelId^>: Include packages in channels up to ^<channelId^>.%HELP_STREAM%
echo                            Common channels are:%HELP_STREAM%
echo                            0 (Stable), 1 (Beta), 2 (Dev), and 3 (Canary).%HELP_STREAM%
echo.%HELP_STREAM%
echo * If the env var REPO_OS_OVERRIDE is set to "windows",%HELP_STREAM%
echo   "macosx", or "linux", packages will be downloaded for that OS.%HELP_STREAM%
exit /b %HELP_EXIT%
