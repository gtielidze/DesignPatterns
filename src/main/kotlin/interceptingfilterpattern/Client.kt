package interceptingfilterpattern

class Client {
    private var filterManager:FilterManager? = null
    @JvmName("setFilterManager1")
    fun setFilterManager(filterManager: FilterManager?) {
        this.filterManager = filterManager
    }
    fun sendRequest(request: String?) {
        filterManager!!.filterRequest(request!!)
    }
}

