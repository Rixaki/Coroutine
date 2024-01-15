package ru.netology.coroutines.dto

data class PostWithComments(
    //val post: Post,
    //val comments: List<Comment>,
    private val post: PostWithAuthor,
    private val comments: List<CommentWithAuthor>
){
    override fun toString(): String {
        return "$post${if (!comments.isNullOrEmpty()) ", comments:$comments" else " has`t comments" }"
    }
}
