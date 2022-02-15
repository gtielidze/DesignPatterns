package commandpattern

class BayStock(val abcStock: Stock) : Order {
    override fun execute() {
        abcStock.bay()
    }

}