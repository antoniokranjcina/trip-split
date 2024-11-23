package com.tripsplit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform