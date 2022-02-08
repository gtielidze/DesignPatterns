package abstractfactory

class FactoryProducer {
    companion object {
        fun getFactory(rounded: Boolean): AbstractFactory {
            return if (rounded) {
                RoundedShapeFactory()
            } else {
                OrdinaryShapeFactory()
            }
        }
    }
}