package observerpattern


//class Subject {
//    private var observers = mutableListOf<Observer>()
//    private var state = 0
//
//    fun getState(): Int {
//        return state
//    }
//    fun setState(state: Int) {
//        this.state = state
//        notifyAllOservers()
//    }
//
//    fun attach(observer: Observer) {
//        observers.add(observer)
//    }
//    fun notifyAllOservers() {
//        for (observer in observers) {
//            observer.update()
//        }
//    }
//}

class Subject {
    private val observers: MutableList<Observer> = ArrayList()
    var state = 0
        set(state) {
            field = state
            notifyAllObservers()
        }

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    private fun notifyAllObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}