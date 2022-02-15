package filterpattern

import kotlin.math.sin

class CriteriaSingle: Criteria {
    override fun meetCriteria(persons: List<Person>): List<Person> {
        val singlePersons: MutableList<Person> = ArrayList()
        for (person in persons) {
            if (person.maritalStatus.equals("SINGLE", ignoreCase = true)) {
                singlePersons.add(person)
            }
        }
        return singlePersons
    }
}