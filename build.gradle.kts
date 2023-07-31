plugins {
    id("java")
    id("application")
}

group = "org.example"
version = "1.0-SNAPSHOT"


application {
    mainClass.set("com.yilmaznaslan.ecommerce.MainApplication")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.slf4j:slf4j-api:2.0.6")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.20.0")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}