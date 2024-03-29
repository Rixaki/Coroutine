package ru.netology.coroutines.dto

/*
data class Post(
    val id: Long,
    val author: String,
    val authorAvatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)
*/
data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
){
    override fun toString(): String {
        return "Post #$id by author #$authorId"
    }
}

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType,
)

enum class AttachmentType {
    IMAGE
}