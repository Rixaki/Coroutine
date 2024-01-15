package ru.netology.coroutines.dto

import okhttp3.OkHttpClient
import ru.netology.coroutines.getAuthorById
import java.util.*


data class Author(
    val id: Long,
    val name: String,
    val avatar: String,
) {
    fun Author(id: Long): Author {
        return Author(id, "", "")
    }

    override fun hashCode(): Int {
        return Objects.hash(id, javaClass)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (javaClass != other?.javaClass) {
            return false
        }

        other as Author

        return id == other.id
    }

    override fun toString(): String {
        return "Author #$id ($name)"
    }
}

fun Author(id: Long): Author {
    return Author(id, "", "")
}

suspend fun authorBySetOrClient(client: OkHttpClient, id: Long, authors: HashSet<Author>): Author {
    if (authors.contains(Author(id = id))) {
        for (author in authors) {
            if (author.equals(Author(id = id)))
                return author
        }
    } else {
        val newAuthor = getAuthorById(client, id)
        authors.add(newAuthor)
        return newAuthor
    }
    return Author(-1)
}