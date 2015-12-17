#!/bin/bash
# This file automatically compiles all java files and and opens the Main class.
clear
echo "Compiling..."
javac *.java
echo "RUNNING MAIN"
echo "============================"
java Main
echo "Done!"
read -rn1
