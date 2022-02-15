package businessdelegatepattern

class JMSService: BusinessService {
    override fun doProcessing() {
        println("Processing task by invoking JMS Service")
    }
}