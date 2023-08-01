plugins {
    java
    application
    id("org.springframework.boot") version "2.6.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

application {
    mainClass.set("com.yilmaznaslan.ecommerce.MainApplication")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-context:5.3.10")
    implementation ("org.springframework.boot:spring-boot-starter-log4j2")
}



tasks.test {
    useJUnitPlatform()
}
