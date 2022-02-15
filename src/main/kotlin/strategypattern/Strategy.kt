package strategypattern

interface Strategy {
    fun doOperations(num1: Int, num2: Int) : Int
}