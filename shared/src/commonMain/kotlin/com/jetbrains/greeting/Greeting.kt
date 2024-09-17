package com.jetbrains.greeting

import kotlin.random.Random

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        val secondWord = if( Random.nextBoolean()) "True" else "False"
        return "Hello, $secondWord ${platform.name.reversed()}!"
    }
}