# Calculator

This project provides a basic calculator that supports ths following operations:
addition, subtraction, division and multiplication (+, -, /, *).

# Package
```
sbt one-jar
```

# Run
```
sbt "run 1-2+3"
```
OR
```
java -jar ./target/scala-2.10/bc_2.10-1.0-one-jar.jar "1+1"
```

# Test
```
sbt test
```

# Versions
* sbtVersion 0.13.0
* scala 2.10.4

# About

The program should respect the following operator precedence (higer level has highest precedence):

* Addition and subtraction are level 1.
* Mutliplication and dicision are level 2.

Operators at the same level will be read from left to right.


