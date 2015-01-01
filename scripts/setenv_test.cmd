@echo off
rem ----------------------------------------------------------------------------
rem Author: Tri H. Nguyen
rem $Revision: $ $Date: $
rem 
rem Description:
rem   Set up environment
rem ----------------------------------------------------------------------------

call setenv.cmd

@echo off

set CLASSPATH=%CLASSPATH%;./lib/sample-ant_test.jar

@echo on
