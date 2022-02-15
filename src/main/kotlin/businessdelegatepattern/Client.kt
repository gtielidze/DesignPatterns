package businessdelegatepattern

class Client(private val businessDelegate: BusinessDelegate) {

    fun doTask(){
        businessDelegate.doTask()
    }
}

