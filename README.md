# Personal RestAssured Java Sample

* Java version 17.0.1 JetBrains
* Gradlew Version 7

## Sample execution
Sample Results: https://jeancarloschavarriahughes.github.io/restassured-sample/build/reports/tests/test/index.html

``` restassured-sample % ./gradlew test

> Task :test

restAssured-gradleTestSuite > Demo > com.example.TestDemo > verifyBodyErrorMsgIsSuccess STANDARD_OUT
    {
        "message": "https://images.dog.ceo/breeds/setter-english/n02100735_10147.jpg",
        "status": "success"
    }

restAssured-gradleTestSuite > Demo > com.example.TestDemo > verifyBodyErrorMsgIsSuccess PASSED
<
restAssured-gradleTestSuite > Demo > com.example.TestDemo > verifyGetAPI PASSED

restAssured-gradleTestSuite > Demo > com.example.TestDemo > verifyMessageLenghtEqualTo STANDARD_OUT
    {
        "message": [
            "https://images.dog.ceo/breeds/spaniel-cocker/bella2.jpg",
            "https://images.dog.ceo/breeds/spaniel-brittany/n02101388_9999.jpg",
            "https://images.dog.ceo/breeds/terrier-sealyham/n02095889_6531.jpg"
        ],
        "status": "success"
    }

restAssured-gradleTestSuite > Demo > com.example.TestDemo > verifyMessageLenghtEqualTo PASSED
<===========--> 85% EXECUTING [4s]

restAssured-gradleTestSuite > Demo > com.example.TestDemo > verifyPostAPI PASSED

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.6.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 5s
3 actionable tasks: 3 executed
```

* Gradle Version

```restassured-sample % ./gradlew --version

------------------------------------------------------------
Gradle 7.6.2
------------------------------------------------------------

Build time:   2023-06-30 15:42:51 UTC
Revision:     dab132169006b16e7ada4ab2456e0c9d6415b52a

Kotlin:       1.7.10
Groovy:       3.0.13
Ant:          Apache Ant(TM) version 1.10.11 compiled on July 10 2021
JVM:          17.0.7 (JetBrains s.r.o. 17.0.7+10-b829.16)
OS:           Mac OS X 13.6.1 x86_64```
