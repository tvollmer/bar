package com.foo

trait Introducer {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultIntroducer extends Introducer

class CustomizedIntroducer(prefix: String, postfix: String) extends Introducer {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}
