package commandpattern

class Stock {
    private val name = "ABC"
    private val quantity = 10

    fun bay() {
        println("Stock [ Name: $name, Quantity: $quantity ] bought")
    }
    fun sell() {
        println("Stock [ Name: $name, Quantity: $quantity ] sold")
    }
}