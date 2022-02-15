package visitorpattern

class Computer: ComputerPart {
    var parts: Array<ComputerPart> = arrayOf(Mouse(), Keyboard(), Monitor())
    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        for (i in parts.indices) {
            parts[i].accept(computerPartVisitor)
        }
        computerPartVisitor.visit(this)
    }
}

