#!/bin/bash
# This file automatically compiles all java files and and opens the Main class.
clear
javac *.java
java Main
echo "Done!"
read -rn1
