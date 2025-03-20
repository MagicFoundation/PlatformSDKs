@echo off

REM ----------------
REM Compress-Archive
REM ----------------

PowerShell -Command "Compress-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/liblldb.dll' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/liblldb.dll.zip' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Compress-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/lib/python3.11/site-packages/lldb/_lldb.exe' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/lib/python3.11/site-packages/lldb/_lldb.exe.zip' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Compress-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang.exe' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang.exe.zip' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Compress-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe.zip' -Force"
IF ERRORLEVEL 1 goto ERROR

PowerShell -Command "Compress-Archive -Path 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang-cl.exe' -DestinationPath 'Android/ndk/27.1.12297006/toolchains/llvm/prebuilt/windows-x86_64/bin/clang-cl.exe.zip' -Force"
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