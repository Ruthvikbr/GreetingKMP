package com.jetbrains.greeting

interface Platform {
    val name: String
}
expect val num:Int
expect fun getPlatform(): Platform