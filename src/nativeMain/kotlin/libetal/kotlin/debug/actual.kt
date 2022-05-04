package libetal.kotlin.debug

import kotlinx.datetime.Clock
import libetal.kotlin.debug.annotations.DebugType

actual infix fun String.debug(message: String) = log(DebugType.DEBUG, white, message.white)

actual infix fun String.info(message: String) = log(DebugType.INFO,yellow, message.yellow)

actual fun warn(TAG: String, message: String, e: Throwable?) = log(DebugType.WARN, TAG.red, message.red, e)

actual fun error(TAG: String, message: String, e: Throwable?) =
    log(DebugType.ERROR, TAG.brightRed, message.brightRed, e)

actual fun wtf(TAG: String, message: String, e: Throwable?) = log(DebugType.WTF, TAG.magenta, message.magenta, e)

actual fun ed(TAG: String, message: String, e: Throwable?) = log(DebugType.ED, TAG.cyan, message.cyan, e)

fun log(type: DebugType, TAG: String, message: String, e: Throwable? = null) =
    println("${Clock.System.now()}:$type:$TAG: $message${e?.let { "\n${it.stackTraceToString()}" } ?: ""}")

actual infix fun String.ed(message: String)  = ed(this,message,null)

actual fun String.wtf(message: String) = wtf(this, message, null)

actual infix fun String.warn(message: String) = warn(this, message, null)

actual infix fun String.error(message: String) = error(this, message, null)