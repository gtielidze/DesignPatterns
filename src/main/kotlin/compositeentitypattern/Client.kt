package compositeentitypattern

class Client {
    private val compositeEntity = CompositeEntity()

    fun printData() {
        for (i in 0 until  compositeEntity.data.size) {
            println("Data: ${compositeEntity.data[i]}")

        }
    }
    fun setData(data1: String, data2: String) {
        compositeEntity.setData(data1,data2)
    }
}

