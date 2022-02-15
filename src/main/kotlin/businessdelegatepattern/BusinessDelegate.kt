package businessdelegatepattern

class BusinessDelegate {
    private val lookupService = BusinessLookUp()
    private var businessService: BusinessService? = null
    private var serviceType: String? = null

    fun setServiceType(serviceType: String?) {
        this.serviceType = serviceType
    }

    fun doTask() {
        businessService = lookupService.getBusinessService(serviceType!!)
        businessService!!.doProcessing()
    }
}
