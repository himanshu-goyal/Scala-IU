package Example
import scala.collection.mutable.{ ArrayBuffer, ListBuffer }

object Assignment4 {

  //1. Find the last element of a list.
  def lastElement(list: List[Int]): Int = {
    return list.last
  }

  // 2. Find the last but one element of a list.
  def lastButOne(list: List[Int]): Int = {
    return list.init.last
  }


  //3. Find out whether a list is a palindrome.
  def palindrome[T](list: List[T]): Boolean = {
    list == list.reverse
  }


  //4. Take two tuples and join them to make a tuple.
  def joinTuple[T](t1:Tuple2[T, T], t2:Tuple2[T, T]) : Tuple4[T, T, T, T] = {
    new Tuple4(t1._1, t1._2, t2._1, t2._2)
  }

  //5.Given a list of strings, print all palindrome strings from the list.
  def palindromeList(list: List[String]){
    var resultList = new ListBuffer[String]()
    for(e <- list){
      val eStr:String = e.toString
      if (eStr == eStr.reverse ) {
        resultList += eStr
        println(eStr)
      }
    }
  }



  def main(args: Array[String]): Unit = {
    println("Last Element of the list {1, 1, 2, 3, 5, 8} is : " +lastElement(List(1, 1, 2, 3, 5, 8)))
    println("Last but one element of the list {1, 1, 2, 3, 5, 8} is : " +lastButOne(List(1, 1, 2, 3, 5, 8)))
    println("is this list a palindrome {1, 1, 2, 1, 1} : " +palindrome(List(1, 1, 2, 1, 1)))
    println("print all palindrome strings from the list {\"tut\", \"hello\", \"rur\", \"malo\", \"kalo\") are : ")
    palindromeList(List("tut", "hello", "rur", "malo", "kalo"))

    val t1 = new Tuple2("Hello ", "World !!!")
    val t2 = new Tuple2("This is ", "Scala.")
    println("2 Tuples join result : " +joinTuple(t1, t2))

  }
}