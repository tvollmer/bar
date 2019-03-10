package com.foo

import java.util.concurrent.atomic.AtomicInteger

/**
  * objects are singleton instances
  *
  * TODO: make this incrementing of `counter` a thread-safe operation ... AtomicInteger as val?
  * https://stackoverflow.com/questions/26902794/concurrency-primitives-in-scala
  */
object IdFactory {
  private val counter = new AtomicInteger(0)
  def create(): Int = {
    counter.incrementAndGet()
  }
}
