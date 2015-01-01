@echo off
rem ----------------------------------------------------------------------------
rem Author: Tri H. Nguyen
rem $Revision: $ $Date: $
rem 
rem Description:
rem   Launch JUnit Test
rem ----------------------------------------------------------------------------

set CLASSPATH_OLD=%CLASSPATH%

set CLASSPATH=%CLASSPATH%;./lib/hello.jar
set CLASSPATH=%CLASSPATH%;./lib/hello_test.jar
set CLASSPATH=%CLASSPATH%;./lib/sample-ant_libs.jar

if "%1" == "test.hello" goto TEST_HELLO
goto USAGE

:TEST_HELLO
set TEST_CLASS=sample.hello.HelloTest
goto TEST

:TEST
%JAVA_HOME%/bin/java org.junit.runner.JUnitCore %TEST_CLASS%
goto END

:USAGE
echo.
echo Usage: %0 [options]
echo where options are
echo   test.hello Test sample.hello.Hello module
echo.
goto END

:END
set CLASSPATH=%CLASSPATH_OLD%
set CLASSPATH_OLD=

@echo on

