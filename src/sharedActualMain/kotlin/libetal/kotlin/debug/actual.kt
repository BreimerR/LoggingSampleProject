package libetal.kotlin.debug

import kotlinx.datetime.Clock
import libetal.kotlin.debug.annotations.DebugType

actual fun debug(TAG: String, message: String) = log(DebugType.DEBUG, TAG.white, message.white)

actual fun info(TAG: String, message: String) = log(DebugType.INFO, TAG.yellow, message.yellow)

actual fun warn(TAG: String, message: String, e: Throwable?) = log(DebugType.WARN, TAG.red, message.red, e)

actual fun error(TAG: String, message: String, e: Throwable?) =
    log(DebugType.ERROR, TAG.brightRed, message.brightRed, e)

actual fun wtf(TAG: String, message: String, e: Throwable?) = log(DebugType.WTF, TAG.magenta, message.magenta, e)

actual fun ed(TAG: String, message: String, e: Throwable?) = log(DebugType.ED, TAG.cyan, message.cyan, e)

fun log(type: DebugType, TAG: String, message: String, e: Throwable? = null) =
    println("${Clock.System.now()}:$type:$TAG: $message${e?.let { "\n${it.stackTraceToString()}" } ?: ""}")
