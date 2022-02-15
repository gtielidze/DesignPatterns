package nullobjectpattern

class RealCustomer(name: String?): AbstractCustomer() {

    init {
        if (name != null) {
            super.name = name
        }
    }
    override fun isNil(): Boolean {
        return false
    }
}

