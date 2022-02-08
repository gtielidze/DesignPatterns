package factorypattern

class ShapeFactory {
    //use getShape method to get object of type shape
    fun getShape(shapeType: String): Shape? {
        return when {
            shapeType.equals("CIRCLE", ignoreCase = true) -> {
                Circle()
            }
            shapeType.equals("RECTANGLE", ignoreCase = true) -> {
                Rectangle()
            }
            shapeType.equals("SQUARE", ignoreCase = true) -> {
                Square()
            }
            else -> null
        }
    }
}