package chainofresponsibilitypattern

class ConsoleLogger(level: Int): AbstractLogger() {

    override fun write(message: String) {
        println("Standard console::Logger: $message")
    }
}