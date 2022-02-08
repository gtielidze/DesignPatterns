package builderpattern

class Pepsi : ColdDrink() {
    override fun price(): Double {
        return 35.0
    }

    override fun name(): String {
        return "Pepsi"
    }
}