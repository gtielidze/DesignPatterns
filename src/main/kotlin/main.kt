import abstractfactory.FactoryProducer
import abstractfactory.OrdinaryShapeFactory
import abstractfactory.Shape
import adapterpattern.AudioPlayer
import builderpattern.MealBuilder
import factorypattern.ShapeFactory
import prototypepattern.ShapeCache
import singleton.SingleObject


fun main() {

//    factoryPattern()
//    abstractFactoryPattern()
//    singletonPattern()
//    builderPattern()
//    prototypePattern()
//    adapterPattern()
}


fun factoryPattern() {
    val shapeFactory = ShapeFactory()

    val circle = shapeFactory.getShape("CIRCLE")
    circle?.draw()

    val rectangle = shapeFactory.getShape("RECTANGLE")
    rectangle?.draw()

    val square = shapeFactory.getShape("SQUARE")
    square?.draw()
}

fun abstractFactoryPattern() {
    val ordinaryShapeFactory = FactoryProducer.getFactory(false)
    val rectangle: Shape? = ordinaryShapeFactory.getShape("rectangle")
    rectangle?.draw()
    val square: Shape? = ordinaryShapeFactory.getShape("square")
    square?.draw()

    val roundedShapeFactory = FactoryProducer.getFactory(true)
    val roundedRectangle = roundedShapeFactory.getShape("roundedrectangle")
    roundedRectangle?.draw()
    val roundedSquare = roundedShapeFactory.getShape("roundedsquare")
    roundedSquare?.draw()

}

fun singletonPattern() {
    SingleObject.printName()
    SingleObject.name = "new name"
    SingleObject.printName()
}

fun builderPattern() {
    val mealBuilder = MealBuilder()
    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal")
    vegMeal.showItems()
    println("Total Cost: " + vegMeal.cost)

    val nonVegMeal = mealBuilder.prepareNonVegMeal()
    println("\n\nNon-veg Meal")
    nonVegMeal.showItems()
    println("Total Cost: " + nonVegMeal.cost)
}

fun prototypePattern() {
    ShapeCache.loadCache()

    val clonedCircle = ShapeCache.getShape("1")
    println("Shape: " + clonedCircle.type)

    val clonedSquare = ShapeCache.getShape("2")
    println("Shape: " + clonedSquare.type)

    val clonedRectangle = ShapeCache.getShape("3")
    println("Shape: " + clonedRectangle.type)

}

fun adapterPattern() {
    val audioPlayer = AudioPlayer()
    audioPlayer.play("mp3", "we are a champions")
    audioPlayer.play("mp4", "wish you were here")
    audioPlayer.play("vlc", "deutschland")
    audioPlayer.play("avi", "9th symphony")
}
