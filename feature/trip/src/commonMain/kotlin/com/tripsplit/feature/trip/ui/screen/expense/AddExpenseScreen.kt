package com.tripsplit.feature.trip.ui.screen.expense

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AddExpenseScreen(
    viewModel: AddExpenseViewModel,
    modifier: Modifier = Modifier
) {
    AddExpenseScreenContent(modifier = modifier)
}

@Composable
fun AddExpenseScreenContent(modifier: Modifier = Modifier) {

}

@Preview
@Composable
private fun AddExpenseScreenPreview() {
    AddExpenseScreenContent()
}
