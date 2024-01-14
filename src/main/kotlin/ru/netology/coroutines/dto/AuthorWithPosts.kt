package ru.netology.coroutines.dto

class AuthorWithPosts(
    val author: Author,
    val posts: List<Post>
) {
    override fun toString(): String {
        return posts.toString()
    }
}