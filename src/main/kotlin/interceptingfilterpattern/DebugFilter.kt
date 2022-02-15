package interceptingfilterpattern

class DebugFilter: Filter {
    override fun execute(request: String) {
        println("request log: $request")
    }
}