package libetal.kotlin.debug

import kotlin.test.Test

class TextColorTest {

    private val message = "Hello World!!"

    @Test
    fun info() {
        TAG info "Hello World!!"
    }

    @Test
    fun debug() {
        TAG debug "Hello World!!"
    }

    @Test
    fun ed() {
        TAG ed message
    }

    @Test
    fun wtf() {
        TAG.wtf(message)
    }

    @Test
    fun warn() {
        TAG.warn(message)
    }

    @Test
    fun error() {
        TAG.error(message)
    }

    /**
     * Used to see the list of
     * colors supported by the current os and target os
     **/
    fun colorSupportChecker() {
        val lim = 255
        var i = 1
        while (i++ < 255) {
            println("\u001b[${i}m" + "MESSAGE $i".reset)
        }
    }

    /**
     * Some terminals support 256 color
     * scheme but this might
     * not be an option to explore for now
     * [README.COLORS.com](http://lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html)
     **/
    @Test
    fun check256ColorSupport() {

    }

    companion object {
        private const val TAG = "TextColorTest"
    }
}