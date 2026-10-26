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
        versionCode = 2
        versionName = "1.1"
    }

    buildTypes {
        release { isMinifyEnabled = false }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
