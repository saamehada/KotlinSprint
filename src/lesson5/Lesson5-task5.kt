package lesson5

import kotlin.random.Random

fun main() {
    val vallueFirst = Random.nextInt(0, 42)
    val vallueSecond = Random.nextInt(0, 42)
    val vallueThird = Random.nextInt(0, 42)

    val mainFirst = readln().toInt()
    val mainSecond = readln().toInt()
    val mainThird = readln().toInt()

    val list1 = listOf(vallueFirst, vallueSecond, vallueThird)
    val list2 = listOf(mainFirst, mainSecond, mainThird)

    val intersection = list1.toSet().intersect(list2.toSet())
    val intersectioncount = intersection.count()


    val answer = when (intersectioncount) {
        0 -> {
            "Вы угадали ноль чисел, не стоит расстраиваться!"
        }

        1 -> {
            "Вы получаете утешительный приз!"
        }

        2 -> {
            "Вы получаете крупный приз!"
        }

        else -> {
            "Вы угадали все числа и выиграли джекпот!!!"
        }
    }

    println(answer)
    println(list1)
}
