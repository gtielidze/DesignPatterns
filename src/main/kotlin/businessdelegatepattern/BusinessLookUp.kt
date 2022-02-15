package businessdelegatepattern

class BusinessLookUp {
    fun getBusinessService(serviceType: String): BusinessService {
        return if (serviceType.equals("EJB", true)) {
            EJBService()
        } else {
            JMSService()
        }
    }
}