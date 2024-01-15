package ru.netology.coroutines.dto

data class PostWithAuthor (
    private val post: Post,
    private val author: Author
){
    override fun toString(): String {
        return "Post #${post.id} by $author"
    }
}