// Plugins
plugins {
    id("java")
    id("application")
    id("org.jetbrains.kotlin.jvm") version "1.9.10"
    id("me.philippheuer.configuration") version "0.10.7"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

// setup
projectConfiguration {
    language.set(me.philippheuer.projectcfg.domain.ProjectLanguage.KOTLIN)
    type.set(me.philippheuer.projectcfg.domain.ProjectType.APP)
    javaVersion.set(JavaVersion.VERSION_17)
}

dependencies {
    // cli
    implementation("com.github.ajalt.clikt:clikt:4.2.1")

    // sdk
	implementation("io.github.cidverse:cid-sdk-java:0.0.7")

    // mockito
    testImplementation("org.mockito:mockito-core:5.6.0")
    testImplementation("org.mockito.kotlin:mockito-kotlin:5.1.0")
}

application {
    mainClass.set("MainKt")
}
