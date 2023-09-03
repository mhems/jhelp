@echo off

set USAGE="Usage: $0 [-m MAIN] [ARGS...]"

set cp="%~dp0\target\jhelp.jar;%~dp0lib\antlr-4.6-complete.jar"
set pkg="com.binghamton.jhelp"
set main="JHelp"

java -cp %CP% "%PKG%.%MAIN%" "%*"
