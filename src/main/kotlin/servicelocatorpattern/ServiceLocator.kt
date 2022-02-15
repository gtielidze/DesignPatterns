package servicelocatorpattern

class ServiceLocator {
    companion object {
        val cache = Cache()

        fun getService(jndiName: String): Service {
            val service = cache.getService(jndiName)
            if (service != null) {
                return service
            }
            val context = InitialContext()
            val service1 = context.lookup(jndiName) as Service
            cache.addService(service1)
            return service1
        }
    }
}