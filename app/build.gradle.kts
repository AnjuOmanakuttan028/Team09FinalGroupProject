plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.team09finalgroupproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.team09finalgroupproject"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.play.services.wearable)
}