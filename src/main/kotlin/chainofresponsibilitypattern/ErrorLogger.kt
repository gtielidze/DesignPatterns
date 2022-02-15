package chainofresponsibilitypattern

class ErrorLogger(level: Int): AbstractLogger() {
    override fun write(message: String) {
        println("Error Console::Logger: $message")
    }
}