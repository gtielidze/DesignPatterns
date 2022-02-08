package abstractfactory

abstract class AbstractFactory {
    abstract fun getShape(shapeType: String?): Shape?
}