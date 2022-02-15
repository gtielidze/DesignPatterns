package observerpattern

class OctalObserver(private val subject: Subject): Observer() {
    init {
        this.subject.attach(this)
    }
    override fun update() {
        println("Octal String: ${Integer.toOctalString(subject.state)}")

    }
}

