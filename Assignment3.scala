package Example


class Assignment3 {

  def add( x:Int, y:Int ) : Int = {
    var result:Int = 0
    result = x + y
    return result
  }


  def subtract( x:Int, y:Int ) : Int = {
    var result:Int = 0
    result = x - y
    return result
  }

  def multiply( x:Int, y:Int ) : Int = {
    var result:Int = 0
    result = x * y
    return result
  }
}

object Assignment3 {
  def main(args: Array[String]): Unit = {
    println("Enter First Number")
    val x = scala.io.StdIn.readLine().toInt

    println("Enter Second Number")
    val y = scala.io.StdIn.readLine().toInt

    var mathOpt = new Assignment3()
    println(mathOpt.add(x, y))
    println(mathOpt.subtract(x, y))
    println(mathOpt.multiply(x, y))

  }
}
