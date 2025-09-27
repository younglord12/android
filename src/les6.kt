fun main() {
    var index = 0
    var numbers = intArrayOf(4, -3, 2, -1, 0, -5)
    for (i in 0..numbers.size - 1) {
        if (numbers[i] < 0) {

            var f = numbers[i]

            for (j in i downTo index + 1) {
                numbers[j] = numbers[j - 1]
            }
            numbers[index] = f
            index += 1

        }

    }
    println(numbers.joinToString())
}