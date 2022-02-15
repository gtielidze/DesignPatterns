package flyweightpattern

class Circle(private val color: String) : Shape {

    private var x = 0
    private var y = 0
    private var radius = 0

    fun setX(x: Int) {
        this.x = x
    }

    fun setY(y: Int) {
        this.y = y
    }

    fun setRadius(radius: Int) {
        this.radius = radius
    }

    override fun draw() {
        println("Circle: Draw() [Color: $color, x: $x, y: $y, radius: $radius")
    }
}

