package libetal.kotlin.debug.annotations

/**@Description
 * Prints out a debug after the function exits
 **/
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR)
annotation class DebugExit(val message: String, val TAG: String = "", val type: DebugType = DebugType.DEBUG)

/**@Description
 * Prints out a debug on function entry
 **/
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR)
annotation class DebugEntry(val message: String, val TAG: String = "", val type: DebugType = DebugType.DEBUG)

/**@Description
 * Prints out a debug on set attempt
 **/
@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class DebugSetter(val message: String, val TAG: String = "", val type: DebugType = DebugType.DEBUG)

/**
 * @Description
 * Prints out a debug on
 * property getters and setters
 * @param message [String] property is generated depending on getter and setter
 * @param TAG [String]
 * @param type [DebugType]
 **/
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.LOCAL_VARIABLE)
annotation class DebugProp(val TAG: String = "", val type: DebugType = DebugType.DEBUG)

/**@Description
 * Don't put DebugExpression
 **/
@Target(AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
annotation class DebugExp(val message: String, val TAG: String = "", val type: DebugType = DebugType.DEBUG)

/**@Description
 * Prints out a debug after the property is gotten
 **/
@Target(AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.VALUE_PARAMETER)
annotation class DebugGetter(val message: String, val TAG: String = "", val type: DebugType = DebugType.DEBUG)

/**@Description
 * Print's out an info message on function start
 * It will add duration details if @[DebugDuration] is used
 * @param message [String]
 * @param TAG     [String] {generated|provided}
 **/
annotation class InfoEntry(val message: String, val TAG: String = "")

/**@Description
 * Print's out an info message on function end / just before return
 * It will add duration details if @[DebugDuration] is used
 * @param message [String]
 * @param TAG     [String] {generated|provided}
 **/
annotation class InfoExit(val message: String, val TAG: String = "")

/**@Description
 * Print's out an info message on getter gotten value
 * It will add duration details if @[DebugDuration] is used
 * @param message [String]
 * @param TAG     [String] {generated|provided}
 **/
annotation class InfoGetter(val message: String, val TAG: String = "")

/**@Description
 * Print's out an info message on getter gotten value
 * It will add duration details if @[DebugDuration] is used
 * @param message [String]
 * @param TAG     [String] {generated|provided}
 *
 * @sample
 *     var foo
 *       @InfoSetter set(value){
 *             // GENERATED_STUB println("INFO: Receiver.foo: Setting with value $value")
 *
 *             // GENERATED_STUB println("INFO: Receiver.foo: Set with value $field")
 *       }
 *
 **/
annotation class InfoSetter(val message: String, val TAG: String = "")

/**@Description
 * Use case doesn't make sense yet
 **/
annotation class Warn(val message: String, val TAG: String = "")

/**@Description
 * Adds a start and end time
 * And outputs the details as
 * @property startTime [Long]  = x {generated}
 * @property endTime   [Long]  = y {generated}
 * @property duration  [Long]  = z {generated}
 **/
annotation class DebugDuration