import java.util.InputMismatchException
import kotlin.system.exitProcess


fun main () { //les10task1
    try {
    println("Введите первое число: ")
    val num1 = readln().toInt()
    println("Введите второе число: ")
    val num2 = readln().toInt()

        val result = num1/num2
        println(result)
    } catch (ex: ArithmeticException){
        println("Деление на 0 запрещено")
    } catch (ex: NumberFormatException) {
        println("Введено не число")
    }
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



fun maine() { //task4
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