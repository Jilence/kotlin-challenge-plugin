import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.20"
}

group = "com.jilence"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://repo.codemc.io/repository/maven-snapshots/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
    implementation("net.axay:kspigot:1.17.2")
    implementation("org.reflections:reflections:0.9.12")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "16"
        }
    }
    withType<JavaCompile> {
        options.release.set(16)
    }
}
