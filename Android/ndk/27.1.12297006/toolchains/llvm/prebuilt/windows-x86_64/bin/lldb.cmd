@ECHO OFF
SET PYTHONHOME=%~dp0..\python3
SET PATH=%~dp0..\python3;%PATH%
%~dp0lldb.exe %*
EXIT /B %ERRORLEVEL%
