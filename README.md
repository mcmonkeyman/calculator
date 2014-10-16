Simple version of basic calculator.
===========

About
-----------
Supports the basic operators: addition, subtraction, division and multiplication (+,-,/,*).
Should respect the following operator precedence (higer level has highest precedence):
  + and - (level1)
  * and / (level2)
Operators at the same level will be read from left to right. 

Build
-----------
From root directory:
  sbt one-jar

Run
----------- 
From root directory:
  sbt "run 1-2+3"
    or
  java -jar ./target/scala-2.10/bc_2.10-1.0-one-jar.jar "1+1"

Test
-----------
From root directory:
  sbt test

Versions
-----------
sbtVersion 0.13.0
scala 2.10.4

