/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.32"
    id("org.openjfx.javafxplugin") version "0.0.9"
    java
    `maven-publish`
    `java-library`
}

repositories {
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://repo1.maven.org/maven2/")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.controlsfx:controlsfx:11.1.0")
    implementation("org.openjfx:javafx-swing:11.0.2")
    implementation("org.openjfx:javafx-controls:14.0.1")
    implementation("org.openjfx:javafx-fxml:14-ea+8")
    implementation("org.openjfx:javafx-web:14-ea+8")
    implementation("org.openjfx:javafx-graphics:14.0.1")
    implementation("org.jetbrains:annotations:RELEASE")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.32")
    implementation("com.google.guava:guava:30.0-jre")
    compile("com.jfoenix:jfoenix:9.0.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.4.31")
    testImplementation("junit:junit:4.12")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    testImplementation("io.mockk:mockk:1.10.6")
    testImplementation("io.kotest:kotest-assertions-core-jvm:4.4.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.4.32")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
    api("org.apache.commons:commons-math3:3.6.1")
    compileOnly("org.jetbrains.kotlin:kotlin-maven-plugin:1.4.32")
}

javafx {
    version = "14.0.1"
    modules("javafx.controls", "javafx.web", "javafx.fxml")
}

//application {
//    // Define the main class for the application.
//    mainClass.set("com.radixpro.enigma.AppLauncherKt")
//}

group = "com.radixpro.enigma"
version = "0.2"
description = "libFE"
java.sourceCompatibility = JavaVersion.VERSION_14

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

