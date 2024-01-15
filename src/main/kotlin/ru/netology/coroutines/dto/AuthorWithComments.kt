package ru.netology.coroutines.dto

data class AuthorWithComments(
    private val author: Author,
    private val comments: List<Comment>
) {
    fun getTempComments (): List<Comment> {//for inner essence and anti-rewrite
        return comments
    }

    override fun toString(): String {
        return comments.toString()
    }
}