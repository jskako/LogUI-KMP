package com.jskako.logui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform