package com.foo

class Point2(var x: Int = 0, var y: Int = 0) {

  def move(dx: Int, dy: Int): Unit ={
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}
