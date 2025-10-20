
// task1
fun applyOperation(numbers: List<Int>, operation: (Int, Int) -> Int): Int {
    return numbers.reduce { acc, num -> operation(acc, num) }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Сумма
    val sum = applyOperation(numbers) { a, b -> a + b }
    println("Сумма: $sum") // Вывод: 15

    // Произведение
    val product = applyOperation(numbers) { a, b -> a * b }
    println("Произведение: $product") // Вывод: 120

    // Максимум
    val max = applyOperation(numbers) { a, b -> maxOf(a, b) }
    println("Максимум: $max") // Вывод: 5
}

//task3
fun mainr() {
    val sum = (1..1_000_000)
        .asSequence()
        .filter { it % 2 == 0 }
        .map { it.toLong() * it } // Преобразуем в Long перед умножением
        .sum()

    println("Сумма квадратов чётных чисел: $sum")
}