package filterpattern

object PrintPersons {
    fun printPersons(persons: List<Person>) {
        for (person in persons) {
            println("Person: [ Name: ${person.name}, Gender: ${person.gender}, Marital Status: ${person.maritalStatus}]")
        }
    }
}