package com.tripsplit.core.data

interface TripRepository {

    suspend fun startTrip()

    suspend fun endTrip()

    suspend fun deleteTrip()
}
