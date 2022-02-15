package interceptingfilterpattern

class FilterChain {
    private val filters: MutableList<Filter> = mutableListOf()
    private var target = Target()

    fun addFilter(filter: Filter) {
        filters.add(filter)
    }

    fun execute(request: String) {
        for (filter in filters) {
            filter.execute(request)
        }
        target.execute(request)
    }

    fun setTarget(target: Target) {
        this.target = target
    }
}