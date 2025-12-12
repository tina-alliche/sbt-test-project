# Contributing to SBT Test Project

Thank you for your interest in contributing to this test project!

## Purpose of This Project

This is a **test and validation project** for the [sbt-actions](https://github.com/tina-alliche/sbt-actions) GitHub Actions. The main goals are:

1. ✅ Validate the `setup-sbt` action works correctly
2. ✅ Provide real-world examples of SBT usage
3. ✅ Test dependency resolution
4. ✅ Demonstrate best practices

## How to Contribute

### Adding Test Scenarios

If you want to add new test scenarios:

1. **Add dependencies** to `build.sbt` if needed
2. **Create Scala classes** in `src/main/scala/com/example/`
3. **Write tests** in `src/test/scala/com/example/`
4. **Update CI workflow** if testing new features
5. **Update README** to document changes

### Example: Adding a New Feature

```scala
// src/main/scala/com/example/StringUtils.scala
package com.example

object StringUtils {
  def reverse(s: String): String = s.reverse
  def palindrome(s: String): Boolean = s == s.reverse
}
```

```scala
// src/test/scala/com/example/StringUtilsSpec.scala
package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StringUtilsSpec extends AnyFlatSpec with Matchers {
  "StringUtils" should "reverse strings correctly" in {
    StringUtils.reverse("hello") shouldBe "olleh"
  }
  
  it should "detect palindromes" in {
    StringUtils.palindrome("racecar") shouldBe true
    StringUtils.palindrome("hello") shouldBe false
  }
}
```

### Testing Changes

Before submitting a PR:

```bash
# Clean build
sbt clean

# Compile
sbt compile

# Run all tests
sbt test

# Verify the app runs
sbt run
```

### Pull Request Process

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-test`)
3. Make your changes
4. Run tests locally
5. Commit with clear messages
6. Push to your fork
7. Open a Pull Request

## Questions?

Open an issue or reach out via the [sbt-actions](https://github.com/tina-alliche/sbt-actions) repository.
