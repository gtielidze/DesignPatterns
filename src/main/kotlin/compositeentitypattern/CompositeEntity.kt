package compositeentitypattern


class CompositeEntity {
    private var cgo = CoarseGrainedObject()


    fun setData(data1: String, data2: String) {
        cgo.setData(data1, data2)
    }


    val data: Array<String>
        get() = cgo.data

}

