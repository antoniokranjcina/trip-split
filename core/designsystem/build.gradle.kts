plugins {
    alias(libs.plugins.tripsplit.kotlinMultiplatform)
    alias(libs.plugins.tripsplit.composeMultiplatform)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.coil.compose)
            implementation(libs.zoomimage.compose.coil)
        }
    }
}
