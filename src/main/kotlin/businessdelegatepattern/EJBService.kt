package businessdelegatepattern

class EJBService: BusinessService {
    override fun doProcessing() {
        println("Processing task by invoking EJB Service")
    }
}