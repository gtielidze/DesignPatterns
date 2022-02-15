package observerpattern

class BinaryObserver(private var subject: Subject) : Observer() {
    init {
        this.subject.attach(this)
    }
    override fun update() {
        println("Binary String: ${Integer.toBinaryString(subject.state)}")
    }
}