package com.tripsplit.core.designsystem

sealed class TripSplitDestination(val route: String) {
    data object Trip : TripSplitDestination(route = "Home")
}
