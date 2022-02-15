package nullobjectpattern



object CustomerFactory {
    private val names = arrayOf("Rob", "Joe", "Julie")
    fun getCustomer(name: String?): AbstractCustomer {
        for (i in names.indices) {
            if (names[i].equals(name, ignoreCase = true)) {
                return RealCustomer(name)
            }
        }
        return NullCustomer()
    }
}