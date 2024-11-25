package com.tripsplit.feature.trip.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TripScreen(
    snackbarHostState: SnackbarHostState,
    onShowSnackbar: suspend (String, String?, SnackbarDuration) -> Boolean,
    modifier: Modifier = Modifier
) {
    TripScreenContent(
        modifier = modifier
    )
}

@Composable
private fun TripScreenContent(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text("Add a new trip here")
    }
}

@Preview
@Composable
private fun TripScreenContentPreview() {
    TripScreenContent()
}
