fun main() { //first task
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    var max = intArray[0]
    var maxIndex = 0
    var min = intArray[0]
    var minIndex = 0

    for (i in intArray.indices) {
        if (intArray[i] > max) {
            max = intArray[i]
            maxIndex = i
        }
    }


    for (i in intArray.indices) {
        if (intArray[i] < min) {
            min = intArray[i]
            minIndex = i
        }
    }

    println("Получилось максимальное число: $max")
    println("Позиция максимального числа: $maxIndex")
    println("Получилось минимальное число: $min")
    println("Позиция максимального числа: $minIndex")
}


fun mic() { //second task
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    var first = 0
    var second = 0
    for (i in intArray) {
        if (i % 2 == 0) {
            first ++
        }
    }


    for (i in intArray) {
        if (i % 2 != 0) {
            second ++
        }
    }

    println("Количество четных чисел: $first")
    println("Количество нечетных чисел: $second")
}

