package dataclasses

interface Attachment {
    var type: String

    fun Attachment(type: String) {
        this.type = type
    }
}

class Audio {}

class AudioAttachment (
    override var type: String,
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val file: Audio
): Attachment

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
