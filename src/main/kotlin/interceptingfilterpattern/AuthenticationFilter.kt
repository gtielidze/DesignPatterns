package interceptingfilterpattern

class AuthenticationFilter: Filter {
    override fun execute(request: String) {
        println("Authenticating request: $request")
    }
}