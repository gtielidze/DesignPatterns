package decoratorpattern

class RedShapeDecorator(decoratedShape: Shape) : ShapeDecorator(decoratedShape) {
    override fun draw() {
        decoratedShape.draw()
        setRedBorder(decoratedShape)
    }
    fun setRedBorder(decoratedShape: Shape) {
        println("Border Color: Red")
    }
}

