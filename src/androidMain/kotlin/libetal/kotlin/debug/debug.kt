package libetal.kotlin.debug

import android.util.Log

actual infix fun String.debug(message: String) {
    Log.d(this, message)
}

actual infix fun String.info(message: String) {
    Log.i(this, message)
}

actual fun warn(TAG: String, message: String, e: Throwable?) {
    Log.w(TAG, message, e)
}

actual fun error(TAG: String, message: String, e: Throwable?) {
    Log.e(TAG, message, e)
}

actual fun wtf(TAG: String, message: String, e: Throwable?) {
    Log.wtf(TAG, message, e)
}

actual fun ed(TAG: String, message: String, e: Throwable?) {
    println("EMOTIONAL_DAMAGE:$TAG:$message\n${e?.stackTrace ?: ""}")
}

actual infix fun String.ed(message: String) = ed(this, message, null)

actual infix fun String.wtf(message: String) = wtf(this, message, null)

actual infix fun String.warn(message: String) = warn(this, message, null)

actual infix fun String.error(message: String) = error(this, message, null)