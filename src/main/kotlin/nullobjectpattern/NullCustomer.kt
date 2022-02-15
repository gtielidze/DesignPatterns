package nullobjectpattern

class NullCustomer : AbstractCustomer() {

    init {
        super.name = "Not Available in customer Database"
    }

    override fun isNil(): Boolean {
        return true
    }


}