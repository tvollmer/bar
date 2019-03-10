package com.foo

/**
 * @author ${user.name}
 *
 * examples from https://docs.scala-lang.org/tour/basics.html
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println(1)
    println(1 + 1)

    println( "Hello World!" )
    println( "Hello," + "World!" )
    println("concat arguments = " + foo(args))

    valsAreFinal()
    varsCanBeReassigned()
    blocksReturnLastLine()
    functionWithNoParams()
    functionWith2Params()
    println("method with no args : " + name)
    println("method addThenMultiply : " + addThenMultiply(1, 2)(3))

    val greeterClass = new Greeter("Hello, ", "!")
    greeterClass.greet("Scala engineer")

    compareCaseClasses()
    objectsAreSingletons()

    introduceTraitWithOverride()

    // types : https://docs.scala-lang.org/tour/unified-types.html
    //    Any
    //      AnyVal ( Double, Float, Long, Int, Short, Byte, Unit, Boolean, Char )
    //          Nothing
    //      AnyRef ( List, Option, YourClass ) [similar to java.lang.Object]
    //        Null [ should almost never be used ]
    //          Nothing


  }

  def valsAreFinal() {
    val x = 1 + 1
    println(x)

    val y: Int = 1 + 1
    println(y)
  }

  def varsCanBeReassigned(): Unit ={
    var x = 1 + 1
    x = 3
    println(x * x)
  }

  def blocksReturnLastLine(): Unit ={
    println({
      val x = 1 + 1
      x + 1
    })
  }

  def functionWithNoParams(): Unit ={
    val add = () => 1 + 1
    println("after adding w/ no args " + add())
  }

  def functionWith2Params(): Unit ={
    val add = (x: Int, y: Int) => x + y
    println("after adding " + add(3, 4))
  }

  def name: String = System.getProperty("user.name", "foo")

  /**
    * Note: multiple parameter lists
    *
    * @param x
    * @param y
    * @param multiplier
    * @return
    */
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int ={
    (x + y) * multiplier
  }

  /**
    * can instantiate case-classes w/out the word 'new'
    */
  def compareCaseClasses(): Unit ={
    val point1 = Point(1, 2)
    val point2 = Point(1, 2)
    val point3 = Point(2, 2)
    if (point1 == point2) {
      println(point1 + " and " + point2 + " are the same.")
    } else {
      println(point1 + " and " + point2 + " are different.")
    } // Point(1,2) and Point(1,2) are the same.

    if (point1 == point3) {
      println(point1 + " and " + point3 + " are the same.")
    } else {
      println(point1 + " and " + point3 + " are different.")
    } // Point(1,2) and Point(2,2) are different.
  }

  def objectsAreSingletons(): Unit ={
    val newId: Int = IdFactory.create()
    println("first id: " + newId) // 1
    val newerId: Int = IdFactory.create()
    println("second id: " + newerId) // 2
  }

  def introduceTraitWithOverride(): Unit ={
    val introducer = new DefaultIntroducer()
    introducer.greet("Scala developer")

    val customIntroducer = new CustomizedIntroducer("How are you, ", "?")
    customIntroducer.greet("Scala developer")
  }

}
