package compositepattern

class Employee(private val name: String, private val dept: String, private val salary: Int) {
    private val subordinates: MutableList<Employee>
    fun add(employee: Employee) {
        subordinates.add(employee)
    }

    fun remove(employee: Employee) {
        subordinates.remove(employee)
    }

    fun getSubordinates(): List<Employee> {
        return subordinates
    }

    override fun toString(): String {
        return "Employee :[ Name : $name, dept : $dept, salary :$salary ]"
    }

    // constructor
    init {
        subordinates = ArrayList()
    }
}