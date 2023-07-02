import jdk.jfr.DataAmount

import scala.io.StdIn._
object Q1 extends App{
  var value = readLine("Enter the deposit value:").toFloat

  def interest(deposit:Double):Double={
    deposit match {
      case d if d<20000 => deposit*2/100
      case d if d<200000 => deposit*4/100
      case d if d<2000000 => deposit*3.5/100
      case _ => deposit*6.5/100
    }
  }
  print("The interest per year is Rs."+interest(value))
}
