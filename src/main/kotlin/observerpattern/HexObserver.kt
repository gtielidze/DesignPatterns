package observerpattern

class HexObserver(private val subject: Subject) : Observer() {

    init {
        this.subject.attach(this)
    }

    override fun update() {
        println("Hex String: ${Integer.toHexString(subject.state).uppercase()}")
    }
}