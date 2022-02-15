package frontcontrollerpattern

class FrontController {

    val dispatcher = Dispatcher()

    private fun isAuthenticUser(): Boolean {
        println("User is authenticated successfully.")
        return true
    }

    private fun trackRequest(request: String) {
        println("Page requested: $request")
    }

    fun dispatchRequest(request: String) {
        trackRequest(request)
        if (isAuthenticUser()) {
            dispatcher.dispatch(request)
        }
    }
}