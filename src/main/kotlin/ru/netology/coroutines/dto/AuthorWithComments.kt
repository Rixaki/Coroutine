package ru.netology.coroutines.dto

data class AuthorWithComments(
    val author: Author,
    val comments: List<Comment>
) {
    override fun toString(): String {
        return comments.toString()
    }
}