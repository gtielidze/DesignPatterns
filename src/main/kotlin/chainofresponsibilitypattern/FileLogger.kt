package chainofresponsibilitypattern

class FileLogger(level: Int) : AbstractLogger() {
    override fun write(message: String) {
        println("File::Logger: $message")
    }
}