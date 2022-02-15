package servicelocatorpattern

class Service2 : Service {
    override fun getName(): String {
        return "Service2"
    }

    override fun execute() {
        println("Executing Service1")
    }
}