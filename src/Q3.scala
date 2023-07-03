import scala.io.StdIn._
object Q3 extends App {
  def toUpper(str:String):String={
    str.toUpperCase()
  }
  def toLower(str: String): String = {
    str.toLowerCase()
  }
  def formatNames(str:String, fIndex:Int, lIndex:Int):String={
    toLower(str.slice(0,fIndex))+toUpper(str.slice(fIndex,lIndex))+toLower(str.slice(lIndex,str.length+1))
  }
  var inpt = readLine("Enter a String: ")
  var fNum = readLine("Enter a number of first element to uppercase: ").toInt
  var lNum = readLine("Enter a number of last element to uppercase: ").toInt
  print(formatNames(inpt, (fNum-1) ,lNum))
}
