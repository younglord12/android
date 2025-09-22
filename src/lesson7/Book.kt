package lesson7


class Book (val author: String, val title: String, val year: String, id: String) : LibraryItem(id), Borrowable {
    override fun toString(): String {
        return "Book(author='$author', title='$title', year='$year')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        if (author != other.author) return false
        if (title != other.title) return false

        return true
    }

    override fun hashCode(): Int {
        var result = author.hashCode()
        result = 31 * result + title.hashCode()
        return result
    }

    override fun borrow(user: String) {
        println("Книга взята: $user")
    }

}