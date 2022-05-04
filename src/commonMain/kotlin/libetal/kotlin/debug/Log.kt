package libetal.kotlin.debug

expect infix fun String.info(message: String)

expect infix fun String.debug(message: String)

expect fun ed(TAG: String, message: String, e: Throwable? = null)

expect fun wtf(TAG: String, message: String, e: Throwable? = null)

expect fun warn(TAG: String, message: String, e: Throwable? = null)

expect fun error(TAG: String, message: String, e: Throwable? = null)

expect infix fun String.ed(message: String)

expect fun String.wtf(message: String)

expect infix fun String.warn(message: String)

expect fun String.error(message: String)
