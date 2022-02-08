package builderpattern

class ChickenBurger: Burger() {
    override fun price(): Double {
        return 50.5
    }

    override fun name(): String {
        return "Chicken Burger"
    }
}