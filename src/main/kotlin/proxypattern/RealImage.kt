package proxypattern

class RealImage(private val fileName: String) : Image {


    private fun loadFromDisk(fileName: String) {
        println("Loading $fileName")

    }

    override fun display() {
        println("Displaying $fileName")
    }

    init {
        loadFromDisk(fileName)
    }
}

