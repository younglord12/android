import java.util.LinkedList

//task2
fun mergeSortedLists(list1: LinkedList<Int>, list2: LinkedList<Int>): LinkedList<Int> {
    val merged = LinkedList<Int>()
    var i = 0
    var j = 0

    while (i < list1.size && j < list2.size) {
        if (list1[i] <= list2[j]) {
            merged.add(list1[i])
            i++
        } else {
            merged.add(list2[j])
            j++
        }
    }

    // Добавляем оставшиеся элементы
    while (i < list1.size) {
        merged.add(list1[i])
        i++
    }

    while (j < list2.size) {
        merged.add(list2[j])
        j++
    }

    return merged
}

//task1
fun main() {
    val list1 = LinkedList(listOf(1, 3, 5, 7))
    val list2 = LinkedList(listOf(2, 4, 6, 8))

    val result = mergeSortedLists(list1, list2)
    println("Слитый список: $result")
}


fun findSurvivor(n: Int): Int {
    val people = LinkedList<Int>()
    for (i in 1..n) {
        people.add(i)
    }

    var index = 0
    while (people.size > 1) {
        index = (index + 1) % people.size
        people.removeAt(index)
    }

    return people.first
}

fun maine() {
    val n = 5
    val survivor = findSurvivor(n)
    println("Победитель: $survivor")
}