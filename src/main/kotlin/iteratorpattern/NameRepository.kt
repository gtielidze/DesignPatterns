package iteratorpattern

class NameRepository: Container {
    val names = listOf("Robert", "John", "Julia", "Lora")

    override fun getIterator(): Iterator {
        return NameIterator()
    }

    inner class NameIterator: Iterator {
        private var index: Int = 0

        override fun hasNext(): Boolean {
            if (index < names.size) {
                return true
            }
            return false
        }

        override fun next(): Any? {
           if (this.hasNext()) {
               return names[index++]
           }
            return null
        }

    }
}


