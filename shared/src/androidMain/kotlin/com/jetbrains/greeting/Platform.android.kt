package com.jetbrains.greeting

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual val num:Int = 42
actual fun getPlatform(): Platform = AndroidPlatform()