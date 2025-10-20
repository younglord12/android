//task 1
fun groupAnagrams(words: List<String>): List<List<String>> {
    return words.groupBy { it.toCharArray().sorted().joinToString("") }
        .values
        .toList()
}

fun main() {
    val words = listOf("listen", "silent", "enlist", "java", "avaj", "world")
    val grouped = groupAnagrams(words)

    println("Группы анаграмм:")
    for (group in grouped) {
        println(group)
    }
}

//task 2
fun findFirstDuplicate(numbers: List<Int>): Int? {
    val seen = mutableSetOf<Int>()
    for (num in numbers) {
        if (!seen.add(num)) {
            return num // Уже было — значит, это первое повторение
        }
    }
    return null // Нет повторений
}

fun maine() {
    val numbers = listOf(3, 5, 1, 4, 5, 2, 3)
    val duplicate = findFirstDuplicate(numbers)
    println("Первое повторяющееся число: $duplicate")
}