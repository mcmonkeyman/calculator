package com.novus.bc

object Operator extends Enumeration {
  val Addition = createOperatorValue("+")
  val Subtraction  = createOperatorValue("-")
  val Multiplication = createOperatorValue("*")
  val Division = createOperatorValue("/")

  def createOperatorValue(name: String): Value with Matching = 
         new Val(nextId, name) with Matching

  trait Matching {
    // enables matching against a particular Operator.Value
    def unapply(s: String): Boolean = 
          (s == toString)
  }
}