package interpreterpattern

object Interpret {
    fun getOrExpression(): Expression {
        val robert = TerminalExpression("Robert")
        val john = TerminalExpression("John")
        return OrExpression(robert, john)
    }

    fun getAndExpression(): Expression {
        val julie = TerminalExpression("Julie")
        val married = TerminalExpression("Married")
        return AndExpression(julie, married)
    }

}