package abstractfactorypattern


class OrdinaryShapeFactory: AbstractFactory() {
    override fun getShape(shapeType: String?): Shape? {
        return when {
            shapeType?.equals("rectangle", ignoreCase = true) == true -> {
                Rectangle()
            }
            shapeType?.equals("square", ignoreCase = true) == true -> {
                Square()
            }
            else -> {
                null
            }
        }
    }
}