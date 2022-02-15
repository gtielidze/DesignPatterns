package chainofresponsibilitypattern

abstract class AbstractLogger {
    companion object {
        const val INFO = 1
        const val DEBUG = 2
        const val ERROR = 3
    }

    private var level = 0

    private var nextLogger: AbstractLogger? = null
    fun setNextLogger(nextLogger: AbstractLogger?) {
        this.nextLogger = nextLogger
    }

    fun logMessage(level: Int, message: String) {
        if (this.level <= level) {
            write(message)
        }
        nextLogger?.logMessage(level, message)
    }

    abstract fun write(message: String)
}

