import scala.io.StdIn._
object Q2 extends App{
  var value = readLine("Please enter an integer: ").toInt
  def checkNegetive(value:Int):Boolean={
    value match{
      case v if v<=0 => true
      case _ => false
    }
  }
  def checkEven(value: Int): Boolean = {
    value match {
      case v if v%2 <= 0 => true
      case _ => false
    }
  }
  def printEven(value:Int):Any={
    if (checkEven(value)) {
      println("This is Even Number")
    }
    else {
      println("This is Odd Number")
    }
  }

  def printNegetive(value:Int):Any={
    if (checkNegetive(value)) {
      println("This is negetive number or 0")
    }
    else {
      println("This is Positive Number")
      printEven(value)
    }
  }

  printNegetive(value)



}
