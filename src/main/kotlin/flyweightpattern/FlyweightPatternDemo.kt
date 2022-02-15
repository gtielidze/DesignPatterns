package flyweightpattern



class FlyweightPatternDemo {
    private val colors = arrayOf("Red", "Green", "Blue", "White", "Black")
    private val randomColor = colors[(Math.random() * colors.size).toInt()]
    private val randomX: Int = (Math.random() * 100).toInt()
    private val randomY: Int = (Math.random() * 100).toInt()

    fun getObjects() {
        for (i in 0..19) {
            val circle = ShapeFactory.getCircle(randomColor) as Circle
            circle.setX(randomX)
            circle.setY(randomY)
            circle.setRadius(100)
            circle.draw()
        }
    }
}
