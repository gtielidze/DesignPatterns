package servicelocatorpattern

class InitialContext {
    fun lookup(jndiName: String): Any? {
        if (jndiName.equals("Service1", ignoreCase = true)) {
            println("Looking up an creating a new Service object")
            return Service1()
        } else if (jndiName.equals("Service2", ignoreCase = true)) {
            println("Looking up an creating a new Service2 object")
            return Service2()
        } else {
            return null
        }
    }
}

