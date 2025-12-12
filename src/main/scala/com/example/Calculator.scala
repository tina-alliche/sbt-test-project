package com.example

import com.typesafe.scalalogging.LazyLogging

/**
 * A simple calculator for testing SBT setup
 */
class Calculator extends LazyLogging {
  
  def add(a: Int, b: Int): Int = {
    logger.debug(s"Adding $a + $b")
    a + b
  }
  
  def subtract(a: Int, b: Int): Int = {
    logger.debug(s"Subtracting $a - $b")
    a - b
  }
  
  def multiply(a: Int, b: Int): Int = {
    logger.debug(s"Multiplying $a * $b")
    a * b
  }
  
  def divide(a: Int, b: Int): Either[String, Double] = {
    if (b == 0) {
      logger.warn("Attempted division by zero")
      Left("Division by zero")
    } else {
      logger.debug(s"Dividing $a / $b")
      Right(a.toDouble / b.toDouble)
    }
  }
  
  def power(base: Int, exponent: Int): Long = {
    logger.debug(s"Computing $base ^ $exponent")
    Math.pow(base.toDouble, exponent.toDouble).toLong
  }
}

object Calculator {
  def apply(): Calculator = new Calculator()
}
