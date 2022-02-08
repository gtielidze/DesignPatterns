package builderpattern

abstract class Burger: Item {

    override fun packing(): Packing {
        return Wrapper()
    }

    abstract override fun price(): Double
}