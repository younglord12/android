package lesson7

data class BookData( val author: String, val title: String, val year: String, val id: String, val genre: Genre) : Borrowable {
    override fun borrow(user: String) {
        println("Книга взята: $user")
    }
    fun isSameBook(other: BookData): Boolean {
        return this.author == other.author && this.title == other.title
    }
}
