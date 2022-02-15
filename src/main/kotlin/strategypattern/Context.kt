package strategypattern

class Context(private val strategy: Strategy) {

    fun executeStrategy(num1: Int, num2: Int) : Int {
        return strategy.doOperations(num1, num2)
    }

}