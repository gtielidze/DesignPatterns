package frontcontrollerpattern

class Dispatcher {
    private val studentView = StudentView()
    private val homeView = HomeView()

    fun dispatch(request: String) {
        if (request.equals("Student", true)) {
            studentView.show()
        } else {
            homeView.show()
        }
    }
}
