package com.tripsplit

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.tripsplit.core.designsystem.theme.TripSplitTheme
import com.tripsplit.navigation.TripSplitNavGraph
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Preview
@Composable
fun App() {
    TripSplitTheme {
        KoinContext {
            TripSplitNavGraph(snackbarHostState = remember { SnackbarHostState() })
        }
    }
}
