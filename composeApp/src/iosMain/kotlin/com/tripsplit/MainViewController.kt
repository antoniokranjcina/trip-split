package com.tripsplit

import androidx.compose.ui.window.ComposeUIViewController
import com.tripsplit.di.appModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        startKoin {
            modules(appModule)
        }
    }
) { App() }
