package builderpattern

class VegBurger: Burger() {
    override fun price(): Double {
        return 25.0
    }

    override fun name(): String {
        return "Veg Burger"
    }
}