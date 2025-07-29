plugins {
    id("java")
    id("me.champeau.jmh") version "0.7.3"
}

group = "org.okruta"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.13.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.27.3")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.wrapper {
    version = 8.14
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(24))
    }
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
    }
}

jmh {
    warmupIterations = 2
    iterations = 2
    fork = 2
    resultFormat = "TEXT" // CSV, JSON, NONE, SCSV, TEXT
    resultsFile = layout.buildDirectory.file("reports/jmh/results.txt")
//    humanOutputFile = layout.buildDirectory.file("reports/jmh/human.txt") // stdout
}