package visitorpattern

class Monitor: ComputerPart {
    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        computerPartVisitor.visit(this)
    }
}