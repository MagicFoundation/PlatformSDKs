@echo off
rem https://stackoverflow.com/a/29057742/632035
for /f "tokens=2" %%a in ("%~dp0") do (
    echo ERROR: NDK path cannot contain spaces
    exit /b 1
)
%~dp0build\ndk-build.cmd %*