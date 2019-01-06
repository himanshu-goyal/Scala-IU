package Example



class AccessModifier {

  private def private_print(){
    println("Hello...This is Private Method from AccessModifier Class")
  }

  protected def protected_print(){
    println("Hello...This is Protected Method from AccessModifier Class")
  }


  def public_print(){
    println("Hello...This is Public Method from AccessModifier Class")
  }

  //Inner Class
  class InnerTestClass {
    private_print() //Inner Class can access private method private_print() from Outer Class
    def inner_print(){
      println("Hello...I am inside inner class's method")
    }
  }

}

// Child Class
class ChildTestClass extends AccessModifier{
  var inner = new InnerTestClass()
  inner.inner_print()
  protected_print() // Child Class can access protected protected_print() from Parent AccessModifier Class
}


object AccessModifier {
  def main(args: Array[String]): Unit = {

    //Protected Modifier Test
    new ChildTestClass()

    //Public AccessModifier Test : Public method can access from any where.
    var modTest = new AccessModifier()
    modTest.public_print()
  }
}