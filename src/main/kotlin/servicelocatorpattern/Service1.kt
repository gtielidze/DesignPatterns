package servicelocatorpattern

class Service1: Service {
    override fun getName(): String {
        return "Service1"
    }

    override fun execute() {
        println("Executing Service1")
    }
}