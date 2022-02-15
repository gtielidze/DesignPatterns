package interpreterpattern

interface Expression {
    fun interpret(context: String): Boolean
}