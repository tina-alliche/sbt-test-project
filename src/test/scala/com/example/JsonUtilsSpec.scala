package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.EitherValues

class JsonUtilsSpec extends AnyFlatSpec with Matchers with EitherValues {
  
  "JsonUtils" should "serialize User to JSON" in {
    val user = User(1, "Alice", "alice@example.com", active = true)
    val json = JsonUtils.userToJson(user)
    
    json should include("\"id\" : 1")
    json should include("\"name\" : \"Alice\"")
    json should include("\"email\" : \"alice@example.com\"")
    json should include("\"active\" : true")
  }
  
  it should "deserialize JSON to User" in {
    val json = """{"id":1,"name":"Bob","email":"bob@example.com","active":false}"""
    val result = JsonUtils.jsonToUser(json)
    
    result.value.id shouldBe 1
    result.value.name shouldBe "Bob"
    result.value.email shouldBe "bob@example.com"
    result.value.active shouldBe false
  }
  
  it should "handle invalid JSON" in {
    val invalidJson = """{"invalid": "json"""
    val result = JsonUtils.jsonToUser(invalidJson)
    
    result.isLeft shouldBe true
  }
  
  it should "pretty print JSON" in {
    val compactJson = """{"name":"Alice","age":30}"""
    val result = JsonUtils.prettyPrint(compactJson)
    
    result.isRight shouldBe true
    result.value should include("\n")
  }
  
  it should "round-trip User through JSON" in {
    val originalUser = User(42, "Charlie", "charlie@example.com")
    val json = JsonUtils.userToJson(originalUser)
    val parsedUser = JsonUtils.jsonToUser(json)
    
    parsedUser.value shouldBe originalUser
  }
}
