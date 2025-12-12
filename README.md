# SBT Test Project

![CI](https://github.com/tina-alliche/sbt-test-project/workflows/CI/badge.svg)

**A test project for validating the [sbt-actions](https://github.com/tina-alliche/sbt-actions) GitHub Actions.**

This project serves as a real-world example and testing ground for the `setup-sbt` GitHub Action, demonstrating various SBT features and dependency management.

## 🎯 Purpose

- ✅ **Validate** the setup-sbt action in real scenarios
- ✅ **Demonstrate** SBT project structure and best practices
- ✅ **Test** dependency resolution (Circe, ScalaTest, Logback)
- ✅ **Verify** compilation, testing, and execution workflows
- ✅ **Example** for users of the sbt-actions

## 📦 Project Structure

```
sbt-test-project/
├── build.sbt                 # SBT build definition
├── project/
│   └── build.properties      # SBT version
├── src/
│   ├── main/
│   │   ├── scala/
│   │   │   └── com/example/
│   │   │       ├── Calculator.scala    # Simple calculator
│   │   │       ├── JsonUtils.scala     # JSON utilities (Circe)
│   │   │       └── Main.scala          # Application entry point
│   │   └── resources/
│   │       └── logback.xml             # Logging configuration
│   └── test/
│       └── scala/
│           └── com/example/
│               ├── CalculatorSpec.scala   # Calculator tests
│               └── JsonUtilsSpec.scala    # JSON tests
└── .github/
    └── workflows/
        └── ci.yml            # CI workflow using setup-sbt action
```

## 🚀 Features Tested

### Dependencies
- **Circe** - JSON serialization/deserialization
- **ScalaTest** - Testing framework
- **Logback** - Logging
- **Scala Parser Combinators** - Standard library

### SBT Features
- ✅ Multi-module-ready structure
- ✅ Test configuration
- ✅ Compiler options
- ✅ Dependency management
- ✅ Resource management

### GitHub Actions Integration
- ✅ Basic compilation and testing
- ✅ Multiple Scala versions (3.3.1, 3.3.0, 3.2.2)
- ✅ Multiple Java versions (17, 21)
- ✅ Cache validation
- ✅ Application execution

## 🛠️ Local Development

### Prerequisites
- Java 17 or 21
- SBT 1.10.4 (or let the action handle it)

### Commands

```bash
# Compile the project
sbt compile

# Run tests
sbt test

# Run the application
sbt run

# Clean build artifacts
sbt clean

# Interactive SBT shell
sbt
```

### Test Coverage

All tests should pass:
```bash
$ sbt test
[info] CalculatorSpec:
[info] Calculator
[info] - should add two numbers correctly
[info] - should subtract two numbers correctly
[info] - should multiply two numbers correctly
[info] - should divide two numbers correctly
[info] - should return error when dividing by zero
[info] - should calculate power correctly
[info] JsonUtilsSpec:
[info] JsonUtils
[info] - should serialize User to JSON
[info] - should deserialize JSON to User
[info] - should handle invalid JSON
[info] - should pretty print JSON
[info] - should round-trip User through JSON
[info] Run completed in X seconds.
[info] Total number of tests run: 11
[info] All tests passed.
```

## 🔧 Using with sbt-actions

This project demonstrates how to use the `setup-sbt` action from [tina-alliche/sbt-actions](https://github.com/tina-alliche/sbt-actions).

### Basic Usage

```yaml
- name: Setup SBT
  uses: tina-alliche/sbt-actions/.github/actions/setup-sbt@main
  with:
    sbt-version: '1.10.4'
    scala-version: '3.3.1'
    java-version: '21'
    enable-cache: true

- name: Build and Test
  run: sbt clean compile test
```

### Testing Multiple Versions

See [`.github/workflows/ci.yml`](.github/workflows/ci.yml) for examples of:
- Testing against multiple Scala versions
- Testing against multiple Java versions
- Using matrix builds

## 📊 CI/CD

The project includes a GitHub Actions workflow that:
1. ✅ Validates the setup-sbt action works correctly
2. ✅ Runs on every push and pull request
3. ✅ Tests multiple Scala and Java versions
4. ✅ Verifies cache functionality

## 🧪 What Gets Tested

### Action Validation
- [x] SBT installation and setup
- [x] Java version configuration
- [x] Dependency resolution (Maven Central)
- [x] Compilation
- [x] Test execution
- [x] Application running
- [x] Cache functionality
- [x] Multiple Scala versions
- [x] Multiple Java versions

### Code Quality
- [x] All tests pass
- [x] Code compiles without warnings
- [x] Logging works correctly
- [x] JSON serialization/deserialization
- [x] Error handling

## 📝 License

MIT License

## 🙏 Acknowledgments

This project is part of the [sbt-actions](https://github.com/tina-alliche/sbt-actions) ecosystem, created to validate and demonstrate GitHub Actions for SBT projects.

---

**Need help?** Check the [sbt-actions documentation](https://github.com/tina-alliche/sbt-actions) or open an issue.
