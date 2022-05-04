@file:Suppress("unused", "UNUSED_VARIABLE")

package libetal.kotlin.debug.annotations

import libetal.kotlin.debug.*

enum class DebugType(val descriptor: String) {
    ED("EMOTIONAL_DAMAGE"),
    WTF("WFT"),
    DEBUG("DEBUG"),
    ERROR("ERROR"),
    INFO("INFO"),
    WARN("WARN");

    override fun toString(): String {
        val label = super.toString()

        return when (this) {
            ED -> label.underline.cyan
            WTF -> label.underline.magenta
            DEBUG -> label.underline.white
            ERROR -> label.underline.brightRed
            INFO -> label.underline.yellow
            WARN -> label.underline.red
        }
    }
}