plugins {
    java
    kotlin("jvm") version "1.9.23"
    `maven-publish`
}

group = "com.valostats.valostats"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io") {
        content {
            includeGroupByRegex("com\\.github\\..*")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.github.CalMWolfs:KtValorantApi:1.0.2")
    implementation("com.github.CalMWolfs:ValorantModelApi:1.2.4")
}

kotlin {
    jvmToolchain(17)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
