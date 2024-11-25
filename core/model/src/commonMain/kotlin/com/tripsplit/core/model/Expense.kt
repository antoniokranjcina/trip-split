package com.tripsplit.core.model

data class Expense(
    val participant: Participant,
    val location: Location,
    val value: String
)
