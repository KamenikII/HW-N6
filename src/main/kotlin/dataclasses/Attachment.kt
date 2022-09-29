package dataclasses

interface Attachment {
    var type: String

    fun Attachment(type: String) {
        this.type = type
    }
}
/*Например так и дальше по аналогии, 
Сами классы аудио, видео не имплементируют интерфейс, 
в то время как классы, имплеметирующие интерфейс содержат поле с соответствующим классом
class Audio {
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val url: String
}

class AudioAttachment (
    override var type: String,
    val file: Audio
    override fun viewAttachment(type: String) {
        println("Type attachment: $type, $file")
    }
): Attachment
*/

class Video {}

class VideoAttachment (
    override var type: String,
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val file: Video
): Attachment

class Photo {}

class PhotoAttachment(
    override var type: String,
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val file: Photo
): Attachment

class File {}

class FileAttachment(
    override var type: String,
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val file: File
): Attachment

class Story {}

class StoryAttachment(
    override var type: String,
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val file: Story
): Attachment
