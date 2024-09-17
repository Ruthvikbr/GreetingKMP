package com.jetbrains.greeting

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual val num:Int = 42
actual fun getPlatform(): Platform = IOSPlatform()