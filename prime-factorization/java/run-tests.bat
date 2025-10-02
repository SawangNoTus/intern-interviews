@echo off
echo Compiling Java files...
javac PrimeFactors.java TestRunner.java

echo.
echo Running manual tests...
java TestRunner

echo.
echo Done!
