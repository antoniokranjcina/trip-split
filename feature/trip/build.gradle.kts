plugins {
    alias(libs.plugins.tripsplit.kotlinMultiplatform)
    alias(libs.plugins.tripsplit.composeMultiplatform)
}


kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.model)
            implementation(projects.core.designsystem)

            implementation(libs.koin.compose)
            implementation(libs.koin.composeVM)

            implementation(libs.navigation.compose)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtimeCompose)

            implementation(libs.filekit.core)

            implementation(libs.coil.compose)
        }
    }
}