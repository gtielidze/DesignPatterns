package commandpattern

class Broker {
    private val orderList: MutableList<Order> = mutableListOf()

    fun takeOrder(order: Order) {
        orderList.add(order)
    }
    fun placeOrder() {
        for(order in orderList) {
            order.execute()
        }
        orderList.clear()
    }

}