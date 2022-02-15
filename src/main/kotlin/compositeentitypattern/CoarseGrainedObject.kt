package compositeentitypattern

class CoarseGrainedObject {
    var dataOne = DependentObjectOne()
    var dataTwo = DependentObjectTwo()

    fun setData(data1: String, data2: String) {
        dataOne.data = data1
        dataTwo.data = data2
    }

    val data: Array<String>
        get() = arrayOf(dataOne.data, dataTwo.data)
}


