package com.example

import io.circe._
import io.circe.generic.semiauto._
import io.circe.parser._
import io.circe.syntax._

/**
 * A simple user data class for testing JSON serialization
 */
case class User(
  id: Int,
  name: String,
  email: String,
  active: Boolean = true
)

object User {
  implicit val userEncoder: Encoder[User] = deriveEncoder[User]
  implicit val userDecoder: Decoder[User] = deriveDecoder[User]
}

/**
 * JSON utilities for testing Circe dependency
 */
object JsonUtils {
  
  def userToJson(user: User): String = {
    user.asJson.spaces2
  }
  
  def jsonToUser(json: String): Either[Error, User] = {
    decode[User](json)
  }
  
  def prettyPrint(json: String): Either[Error, String] = {
    parse(json).map(_.spaces2)
  }
}
