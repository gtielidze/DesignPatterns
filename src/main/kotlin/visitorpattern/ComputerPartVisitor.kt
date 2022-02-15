package visitorpattern

interface ComputerPartVisitor {
    fun visit(keyboard: Keyboard)
    fun visit(computer: Computer)
    fun visit(mouse: Mouse)
    fun visit(monitor: Monitor)
}