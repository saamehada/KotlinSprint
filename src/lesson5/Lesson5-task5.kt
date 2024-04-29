package lesson5

import kotlin.random.Random

fun main() {
    val vallueFirst = Random.nextInt(0, 42)
    val vallueSecond = Random.nextInt(0, 42)
    val vallueThird = Random.nextInt(0, 42)

    val mainFirst = readln()
    val mainSecond = readln()
    val mainThird = readln()

    val list1 = listOf(vallueFirst, vallueSecond, vallueThird)
    val list2 = listOf(mainFirst, mainSecond, mainThird)

    val intersection = list1.toSet().intersect(list2.toSet())
    val intersectioncount = intersection.count()


    if (intersectioncount == 0) {
        println("Вы угадали ноль чисел, не стоит расстраиваться!")
    } else if (intersectioncount == 1) {
        println("Вы получаете утешительный приз!")
    } else if (intersectioncount == 2) {
        println("Вы получаете крупный приз!")
    } else {
        println("Вы угадали все числа и выиграли джекпот!!!")
    }


    println(list1)
}
