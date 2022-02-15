package nullobjectpattern


abstract class AbstractCustomer {
    var name: String = ""
    abstract fun isNil(): Boolean

}