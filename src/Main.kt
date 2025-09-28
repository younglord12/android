import kotlin.system.exitProcess
import game.Skills
import game.Paladin
import game.Outlaw
import game.Archer


fun main() {
    val player1 = chooseCharacter()
    val player2 = chooseCharacter()
    duel(player1, player2)
}
    fun chooseCharacter(): Skills {
        println("Выберите класс персонажа:")
        println("1 — Паладин")
        println("2 — Разбойник")
        println("3 — Лучник")

        while (true) {
            val input = readLine()
            val choice = input?.toIntOrNull()

            when (choice) {
                1 -> return Paladin()
                2 -> return Outlaw()
                3 -> return Archer()
                else -> println("Неверный выбор. Введите 1, 2 или 3:")
            }
        }
    }

    fun duel(player1: Skills, player2: Skills) {
        var turn = 1

        while (player1.health > 0 && player2.health > 0) {
            println("\nХод $turn")

            if (turn % 2 != 0) {
                println("Игрок 1 атакует")
                player1.attack(player2)
            } else {
                println("Игрок 2 атакует")
                player2.attack(player1)
            }

            println("Здоровье Игрока 1: ${player1.health}")
            println("Здоровье Игрока 2: ${player2.health}")

            turn++
        }

        val winner = if (player1.health > 0) "Игрок 1" else "Игрок 2"
        println("\nПобедил $winner!")
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