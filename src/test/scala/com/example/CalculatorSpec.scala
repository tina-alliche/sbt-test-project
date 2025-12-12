package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorSpec extends AnyFlatSpec with Matchers {
  
  val calculator = Calculator()
  
  "Calculator" should "add two numbers correctly" in {
    calculator.add(2, 3) shouldBe 5
    calculator.add(-1, 1) shouldBe 0
    calculator.add(0, 0) shouldBe 0
  }
  
  it should "subtract two numbers correctly" in {
    calculator.subtract(5, 3) shouldBe 2
    calculator.subtract(3, 5) shouldBe -2
    calculator.subtract(0, 0) shouldBe 0
  }
  
  it should "multiply two numbers correctly" in {
    calculator.multiply(3, 4) shouldBe 12
    calculator.multiply(-2, 3) shouldBe -6
    calculator.multiply(0, 100) shouldBe 0
  }
  
  it should "divide two numbers correctly" in {
    calculator.divide(10, 2) shouldBe Right(5.0)
    calculator.divide(7, 2) shouldBe Right(3.5)
    calculator.divide(-10, 2) shouldBe Right(-5.0)
  }
  
  it should "return error when dividing by zero" in {
    calculator.divide(10, 0) shouldBe Left("Division by zero")
  }
  
  it should "calculate power correctly" in {
    calculator.power(2, 3) shouldBe 8
    calculator.power(5, 2) shouldBe 25
    calculator.power(10, 0) shouldBe 1
  }
}
