package app.schotersfinalproject

data class PostModel(
    val _id: String? = null,
    val author: String? = null,
    val authorSlug: String? = null,
    val content: String? = null,
    val dateAdded: String? = null,
    val dateModified: String? = null,
    val length: Int? = null,
    val tags: List<String>? = null
)
