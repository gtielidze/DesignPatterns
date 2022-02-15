package chainofresponsibilitypattern

object ChainPatternDemo {

    fun getChainOfLoggers(): AbstractLogger {
        val errorLogger: AbstractLogger = ErrorLogger(AbstractLogger.ERROR)
        val fileLogger: AbstractLogger = FileLogger(AbstractLogger.DEBUG)
        val consoleLogger: AbstractLogger = ConsoleLogger(AbstractLogger.INFO)

        errorLogger.setNextLogger(fileLogger)
        fileLogger.setNextLogger(consoleLogger)
        return errorLogger

    }
}