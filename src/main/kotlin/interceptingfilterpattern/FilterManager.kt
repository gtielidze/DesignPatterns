package interceptingfilterpattern

class FilterManager(target: Target) {
    var filterChain: FilterChain

    init {
        filterChain = FilterChain()
        filterChain.setTarget(target)
    }

    fun setFilter(filter: Filter) {
        filterChain.addFilter(filter)
    }

    fun filterRequest(request: String) {
        filterChain.execute(request)
    }

}

