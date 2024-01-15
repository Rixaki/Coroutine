package ru.netology.coroutines.dto

data class CommentWithAuthor(
    private val comment: Comment,
    private val author: Author
) {
    override fun toString(): String {
        return "Comment #${comment.id} by $author for post #${comment.postId}"
    }
}