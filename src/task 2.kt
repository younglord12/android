data class `task 2`(val name: String, val age: Int)

fun main() {
    val people = listOf(
        `task 2`("Alice", 17),
        `task 2`("Bob", 25),
        `task 2`("Charlie", 19),
        `task 2`("Diana", 16),
        `task 2`("Eve", 30)
    )

    people
        .filter { it.age > 18 }
        .sortedByDescending { it.age }
        .apply {
            println("Люди старше 18, отсортированы по убыванию возраста:")
        }
        .let { sortedList ->
            sortedList.forEach { println("${it.name}, ${it.age} лет") }
        }
}
