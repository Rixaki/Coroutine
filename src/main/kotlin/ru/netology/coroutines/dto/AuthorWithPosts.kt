package ru.netology.coroutines.dto

data class AuthorWithPosts(
    private val author: Author,
    private val posts: List<Post>
) {
    fun getTempPosts(): List<Post>{
        return posts
    }

    override fun toString(): String {
        return posts.toString()
    }
}