import kotlin.system.exitProcess
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread
import java.util.concurrent.locks.ReentrantLock


//task2
fun main() {
    val counter = AtomicInteger(0)

    val incrementTask = {
        repeat(1000) {
            counter.incrementAndGet()
        }
    }

    val thread1 = thread(start = true) { incrementTask() }
    val thread2 = thread(start = true) { incrementTask() }

    thread1.join()
    thread2.join()

    println("Итоговое значение счетчика: ${counter.get()}")
}

//task3

class Counter(private val lock: ReentrantLock) {
    var count = 0
        private set

    fun increment() {
        lock.lock()
        try {
            count++
        } finally {
            lock.unlock()
        }
    }

    fun decrement() {
        lock.lock()
        try {
            count--
        } finally {
            lock.unlock()
        }
    }
}

fun maine() {
    val lock = ReentrantLock()
    val counter = Counter(lock)

    val incrementThread = thread {
        repeat(1000) {
            counter.increment()
        }
    }

    val decrementThread = thread {
        repeat(1000) {
            counter.decrement()
        }
    }

    incrementThread.join()
    decrementThread.join()

    println("Итоговое значение счетчика: ${counter.count}")
}


//task 1 main
fun mainr() {
    val lock = ReentrantLock() // внешний объект синхронизации
    val counter = Counter(lock)

    val incrementThread = thread {
        repeat(1000) {
            counter.increment()
        }
    }

    val decrementThread = thread {
        repeat(1000) {
            counter.decrement()
        }
    }

    incrementThread.join()
    decrementThread.join()

    println("Итоговое значение count: ${counter.count}")
}
/*fun main() { //task 1
    println("Введите число: ")
    val a = readln().toInt()
    val str = a.toString()
    var Pal = true

    for(i in 0 until str.length / 2) {
        if (str[i] != str[str.length - 1 - i]){
            Pal = false
            break
        }
    }
    println("Число палиндром: $Pal")
}



fun main() { //task4
    println("Введите высоты лесенки: ")
    val n = readln().toInt()

    for(i in n downTo 1) {
        println("#".repeat(i))
    }
}


fun man() { //task3
    println("Введите число: ")
    var result = readln().toInt()

    while (result >= 10) {
        var sum = 0
        for (digitChar in result.toString()) {
            val digit = digitChar.toString().toInt()
            sum += digit
        }
        println("Сложение цифр: $sum")
        result = sum
    }
    println("Получилось число: $result")
}

fun milk(){//task 2
    println("Введите число: ")
    val a = readln().toInt()
    var health = true

    if(a < 2) {
        health = false
    } else {
        for (i in 2 until a) {
            if(a % i == 0) {
                break
            }
        }
    }
    if (health) {
        println("$a - простое число")
    } else {
        println("$a - не простое число")
    }
}

 */