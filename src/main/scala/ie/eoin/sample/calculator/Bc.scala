package ie.eoin.sample.calculator

import ie.eoin.sample.calculator.Operator._

object Bc {
  val number = """(\-?\d*\.?\d+)""".r
  val levelOne = """(.*[^-+*/])([\+|\-])(.*)""".r
  val levelTwo = """(.*)([\*|\/])(.*)""".r
  
  def processInput(input: String): Double = {
    removeSpaces(input) match {
      case number(n) => n.toDouble 
      case levelOne(left, operator, right) => {
        operator  match  {
          case Addition() => processInput(left) + processInput(right)
          case Subtraction() => processInput(left) - processInput(right)
        }
      }
      case levelTwo(left, operator, right) => {
        operator match  {
          case Multiplication() => processInput(left) * processInput(right)
          case Division() => {
            val l = processInput(left)
            val r = processInput(right)
            if(r == 0.0) throw new ArithmeticException("Division by zero.")
            round(l/r)
          }
        }
      }
      case badExpresssion => throw new InvalidExpressionException(f"Invalid (sub)expression: '$badExpresssion%s'") 
    }
  }

  def main(args: Array[String]) = {
    require(args.length == 1, "One arguement required, of the form 1+1")
    val result = processInput(args(0))
    println(result)
  }

  def removeSpaces(input: String): String = {
    input.replaceAll("""(?m)\s+""", "")
  }

  def round(input: Double) : Double = {
    input.toInt.toDouble
  }
}
