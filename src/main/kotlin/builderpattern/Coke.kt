package builderpattern

class Coke: ColdDrink() {
    override fun price(): Double {
        return 30.0
    }

    override fun name(): String {
        return "Coke"
    }
}