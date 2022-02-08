package adapterpattern

class Mp4Player : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        TODO("Not yet implemented")
    }

    override fun playMp4(fileName: String) {
        println("Playing mp4 file. Name: $fileName")
    }
}