package strategypattern

class OperationAdd: Strategy {
    override fun doOperations(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}