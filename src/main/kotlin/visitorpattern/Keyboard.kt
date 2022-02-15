package visitorpattern

class Keyboard : ComputerPart {

    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        computerPartVisitor.visit(this)
    }
}
