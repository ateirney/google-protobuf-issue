import com.google.protobuf.gradle.*

plugins {
    id("java")
    id("com.google.protobuf") version "0.9.3"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.protobuf:protobuf-java:3.21.7")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.21.7"
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("bq-schema")
            }
        }
    }
}
