@echo off

REM ----------------
REM Expand-Archive
REM ----------------

PowerShell -Command "Expand-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/liblldb.dll.zip' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Expand-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/lib/python3.11/site-packages/lldb/_lldb.exe.zip' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/lib/python3.11/site-packages/lldb/' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Expand-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang.exe.zip' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Expand-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe.zip' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Expand-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang-cl.exe.zip' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/' -Force"
IF ERRORLEVEL 1 goto ERROR

REM -------------------
REM FINISHED/ERROR/EXIT
REM -------------------

:FINISHED

echo.
echo Finished
PAUSE
goto EXIT

:ERROR

PAUSE
EXIT /B 1

:EXIT