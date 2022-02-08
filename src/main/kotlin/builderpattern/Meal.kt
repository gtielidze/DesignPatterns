package builderpattern


class Meal {
    private val items = mutableListOf<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    val cost: Double
        get() {
            var cost = 0.0
            for (item in items) {
                cost += item.price()
            }
            return cost
        }


    fun showItems() {
        for (item in items) {
            println("Item :" + item.name())
            println("Packing: " + item.packing().pack())
            println("Price: " + item.price())
        }
    }
}

