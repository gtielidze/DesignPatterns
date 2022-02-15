package servicelocatorpattern

class Cache {
    private val services: MutableList<Service> = mutableListOf()

    fun getService(serviceName: String): Service? {
        for (service in services) {
            if (service.getName().equals(serviceName, ignoreCase = true)) {
                println("Returning cached $serviceName object")
                return service
            }
        }
        return null
    }
    fun addService(newService: Service) {
        var exists = false
        for (service in services) {
            if (service.getName().equals(newService.getName(), ignoreCase = true)) {
                exists = true
            }
        }
        if(!exists) {
            services.add(newService)
        }
    }
}