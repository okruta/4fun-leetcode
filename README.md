# 4fun-leetcode

Implementations of leetcode problems in java

## Usage of Java Microbenchmark Harness (JMH)

To test performance of solutions create new class in src/jmh and run:

```
./gradlew jmh 
```

Run single benchmark / class

```
./gradlew jmh -PjmhIncludes=PalindromeNumberJmh
```

Defaults are in [build.gradle.kts](build.gradle.kts)

### Links

- [JMH](https://github.com/openjdk/jmh) 
- [JMH gradle pluglin](https://github.com/melix/jmh-gradle-plugin)