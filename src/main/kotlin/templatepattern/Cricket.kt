package templatepattern

class Cricket() : Game() {
    override fun initialize() {
        println("Cricket game initialized, Start Playing")
    }

    override fun startPlay() {
        println("Cricket game started. Enjoy the game")
    }

    override fun endPlay() {
        println("Cricket game Finished")
    }
}