package Example

object Assignment2 {

  // 2. Determine whether a given integer number is prime.
  def isPrime(number: Int) =
    if (number <= 1)
      false
    else if (number == 2)
      true
    else
      !(2 to number/2).exists(x => number % x == 0)



// 3. Determine the greatest common divisor of two positive integer numbers.
  def gcd(x: Int, y: Int) : Int = {
    if (x == 0) y
    else if (y == 0) x
    else if (x < y) gcd(x, y-x)
    else gcd(x-y,y)
  }

  // 4.Use def keyword and define functions in scala and execute them by passing values to variables.
  def add( x:Int, y:Int ) : Int = {
    var sum:Int = 0
    sum = x + y
    return sum
  }

  def main(args: Array[String]): Unit = {
    println("Enter Number to Check Prime")
    var primeNumber = (scala.io.StdIn.readLine()).toInt
    println(isPrime(primeNumber))

    println("Enter First number for GCD")
    var firstGCDNumber = (scala.io.StdIn.readLine()).toInt
    println("Enter First number for GCD")
    var secondGCDNumber = (scala.io.StdIn.readLine()).toInt
    println("GCD is ",gcd(firstGCDNumber,secondGCDNumber))

    println("Sum of two enter number for GCD is",add(firstGCDNumber,secondGCDNumber))
  }
}