package filterpattern

interface Criteria {
    fun meetCriteria(persons: List<Person>): List<Person>
}
