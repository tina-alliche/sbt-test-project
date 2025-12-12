package com.example

import com.typesafe.scalalogging.LazyLogging

/**
 * Main application entry point
 */
object Main extends App with LazyLogging {
  
  logger.info("SBT Test Project Started")
  
  // Test Calculator
  val calc = Calculator()
  val sum = calc.add(10, 5)
  logger.info(s"10 + 5 = $sum")
  
  val product = calc.multiply(7, 8)
  logger.info(s"7 * 8 = $product")
  
  calc.divide(10, 2) match {
    case Right(result) => logger.info(s"10 / 2 = $result")
    case Left(error) => logger.error(s"Error: $error")
  }
  
  // Test JSON serialization
  val user = User(1, "Alice", "alice@example.com")
  val json = JsonUtils.userToJson(user)
  logger.info(s"User as JSON: $json")
  
  JsonUtils.jsonToUser(json) match {
    case Right(parsedUser) => logger.info(s"Parsed user: ${parsedUser.name}")
    case Left(error) => logger.error(s"Parse error: $error")
  }
  
  logger.info("SBT Test Project Finished")
}
