package adapterpattern

class VlcPlayer: AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        println("Playing vlc file. Name: $fileName")
    }

    override fun playMp4(fileName: String) {
        //TODO("Not yet implemented")
    }
}