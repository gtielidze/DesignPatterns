package interceptingfilterpattern

interface Filter {
    fun execute(request: String)
}