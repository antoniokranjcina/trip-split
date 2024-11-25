package com.tripsplit.core.data

import com.tripsplit.core.model.Expense

internal class ExpenseRepositoryImpl : ExpenseRepository {
    override suspend fun addExpense(expense: Expense) {
    }

    override suspend fun getExpenses(): List<Expense> {
        return emptyList()
    }
}
