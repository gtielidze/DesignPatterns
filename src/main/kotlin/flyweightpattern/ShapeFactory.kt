package flyweightpattern

object ShapeFactory {

    private val circleMap = HashMap<Any?, Any?>()
    fun getCircle(color: String): Shape {
        var circle = circleMap[color] as Circle?
        if (circle == null) {
            circle = Circle(color)
            circleMap[color] = circle
            println("Creating circle of color : $color")
        }
        return circle
    }
}