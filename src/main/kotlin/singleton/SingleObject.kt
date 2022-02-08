package singleton

object SingleObject{

    init {
        println("Singleton class")
    }
    var name = "Singleton"
    fun printName() {
        println(name)
    }
}