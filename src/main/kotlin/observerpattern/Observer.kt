package observerpattern

abstract class Observer {
    private var subject = Subject()
    abstract fun update()
}