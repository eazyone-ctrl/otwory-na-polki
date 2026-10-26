plugins {
    id("com.android.application")
}

android {
    namespace = "pl.otwory.polki"
    compileSdk = 34

    defaultConfig {
        applicationId = "pl.otwory.polki"
        minSdk = 24
        targetSdk = 34
        versionCode = 32
        versionName = "4.5"
    }

    signingConfigs {
        create("staly") {
            storeFile = file("otwory.jks")
            storePassword = "WlLFTYIjXWuI59dKb3QFj4rt"
            keyAlias = "otwory"
            keyPassword = "WlLFTYIjXWuI59dKb3QFj4rt"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("staly")
        }
        debug {
            signingConfig = signingConfigs.getByName("staly")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
