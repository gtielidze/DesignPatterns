package filterpattern

class OrCriteria(private val criteria: Criteria, private val otherCriteria: Criteria) : Criteria {

    override fun meetCriteria(persons: List<Person>): List<Person> {
        val firstCriteriaItems = criteria.meetCriteria(persons) as MutableList
        val otherCriteriaItems = otherCriteria.meetCriteria(persons)
        for (person in otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person)
            }
        }
        return firstCriteriaItems
    }
}




