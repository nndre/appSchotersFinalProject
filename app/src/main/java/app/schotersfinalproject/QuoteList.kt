package app.schotersfinalproject

data class QuoteList(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val result: List<PostModel>,
    val totalCount: Int,
    val totalPages: Int
)
