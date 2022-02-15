package mementopattern

class CareTake {
    val mementoList = mutableListOf<Memento>()

    fun add(state: Memento) {
        mementoList.add(state)
    }
    fun getMementoFromList(index: Int): Memento {
        return mementoList[index]
    }
}