package com.tripsplit.core.data

import com.tripsplit.core.model.Expense

interface ExpenseRepository {

    suspend fun addExpense(expense: Expense)

    suspend fun getExpenses(): List<Expense>
}
