data class song(
    var id:Int,
    var songname:String,
    var duration:Float,
    var artistname:String

    )

fun main() {


    var songList= mutableListOf<song>()
    songList.add(song(1,"Kalank",4.30f,"Arijit Singh"))
    songList.add(song(2 ,"Baatein ye kabhi na",4f,"Arijit Singh"))

    for (song in songList)
    {
        println("""
            Id:${song.id}
            Song Name: ${song.songname}
            Duration:${song.duration}
            Artist:${song.artistname}
            
        """.trimIndent())
    }
}
