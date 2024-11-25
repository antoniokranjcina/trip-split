package com.tripsplit.core.model

data class Trip(
    val startDate: String,
    val endDate: String,
    val state: State,
    val expenses: List<Expense>
)

enum class State {
    Start,
    InProgress,
    End
}
