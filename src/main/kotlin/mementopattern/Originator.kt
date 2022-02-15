package mementopattern

class Originator() {
    var state: String = ""
    fun saveStateToMemento(): Memento {
        return Memento(state)
    }

    fun getStateFromMemento(memento: Memento) {

        state = memento.state
    }
}
