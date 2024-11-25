package com.tripsplit.core.data.di

import com.tripsplit.core.data.ExpenseRepository
import com.tripsplit.core.data.ExpenseRepositoryImpl
import com.tripsplit.core.data.TripRepository
import com.tripsplit.core.data.TripRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    single<ExpenseRepository> {
        ExpenseRepositoryImpl()
    }
    single<TripRepository> {
        TripRepositoryImpl()
    }
}
