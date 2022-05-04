@file:Suppress("unused", "UNUSED_VARIABLE")

package libetal.kotlin.debug.annotations


internal class Example
@DebugExit("Initialized Example")
@DebugEntry("Initializing a Example...") constructor() {

    init {
        prepareUser()
    }

    @DebugExit("Prepared User [user]")
    fun prepareUser() {
        @DebugProp("")
        val user = User("Breimer")
    }

}

internal data class User
@DebugEntry("Creating user with [name]")
constructor(val name: String)