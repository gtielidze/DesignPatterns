package adapterpattern

class AudioPlayer : MediaPlayer {
    private lateinit var mediaAdapter: MediaPlayer

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("mp3", ignoreCase = true)) {
            println("Playing mp3 file. Name: $fileName")
        } else if (audioType.equals("vlc", ignoreCase = true) || audioType.equals("mp4", ignoreCase = true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter.play(audioType, fileName)
        } else {
            println("Invalid media: $audioType format not supported")
        }
    }
}