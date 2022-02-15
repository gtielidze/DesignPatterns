package interceptingfilterpattern

class Target {
    fun execute(request: String) {
        println("Executing request: $request")
    }
}