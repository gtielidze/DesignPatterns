package abstractfactory

class RoundedShapeFactory : AbstractFactory() {
    override fun getShape(shapeType: String?): Shape? {
        return when {
            shapeType?.equals("roundedrectangle", ignoreCase = true) == true -> {
                RoundedRectangle()
            }
            shapeType?.equals("roundedsquare", ignoreCase = true) == true -> {
                RoundedSquare()
            }
            else -> (null)
        }
    }
}