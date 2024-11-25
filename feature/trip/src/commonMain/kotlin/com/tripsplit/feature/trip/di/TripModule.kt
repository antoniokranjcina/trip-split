package com.tripsplit.feature.trip.di

import com.tripsplit.feature.trip.ui.screen.TripViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val tripModule = module {
//    viewModelOf(::TripViewModel)
    viewModel {
        TripViewModel()
    }
}
