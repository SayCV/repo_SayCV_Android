@echo off
echo Copyright 2013 SayCV Inc. All rights reserved.
echo Use of this source code is governed by a BSD-style
echo license that can be found in the LICENSE file.
echo.
echo 2013 @ SayCV.Xiao
echo.

cd /d %~dp0
rem set PATH=D:\MinGW\msys\1.0\bin;D:\MinGW\msys\1.0\local\bin;D:\MingW\bin;%PATH%

set PATH=D:\cygwin\bin;%PATH%
set PATH=D:\cygwin\usr\sbin;%PATH%

set HOME=%cd%
set ENTRY_DIR=%cd%

rem export ANDROID_HOME=/cygdrive/f/GreenSoft/android-sdk
set ANDROID_HOME=F:/GreenSoft/android-sdk

set M2_HOME=F:/GreenSoft/android-sdk/apache-maven-3.0.5
set M2=%M2_HOME%/bin
set PATH=%M2%;%PATH%

set JAVA_HOME=D:/cygwin/home/Java/jdk1.7.0_11
set PATH=%JAVA_HOME%/bin;%PATH%

rem bash --login -i -c "make ncurses"

@echo Verify that it is correctly installed

call mvn --version

cmd

pause
exit

##############################
Building Android Applications
The build requires Maven v3.0.3+ and the Android SDK to be installed in your development environment. In addition you'll need to set the ANDROID_HOME environment variable to the location of your SDK:

export ANDROID_HOME=/opt/tools/android-sdk
After satisfying those requirements, the build is pretty simple:

Run mvn clean package from the app directory to build the APK only
Run mvn clean install from the root directory to build the app and also run the integration tests, this requires a connected Android device or running emulator
##############################