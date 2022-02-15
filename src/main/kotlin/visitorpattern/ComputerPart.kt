package visitorpattern

interface ComputerPart {
    fun accept(computerPartVisitor: ComputerPartVisitor)
}