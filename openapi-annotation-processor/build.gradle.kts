description = "Javalin OpenAPI Annotation Processor | Generates OpenApi specification from @OpenApi annotations"

plugins {
    kotlin("kapt")
}

dependencies {
    api(project(":openapi-specification"))
    kaptTest(project(":openapi-annotation-processor"))

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.20")
    implementation("com.google.code.gson:gson:2.10")
    implementation("io.swagger.parser.v3:swagger-parser:2.1.8")

    implementation("io.javalin:javalin:5.2.0") {
        exclude(group = "org.slf4j")
    }

    @Suppress("GradlePackageUpdate")
    implementation("ch.qos.logback:logback-classic:1.2.11")
}