package lesson5

fun main() {
    val vallueSecond = readln()!!.toInt()
    val vallueFirst = readln()!!.toInt()


    if ((vallueFirst == NUMBER_TO_WIN_FIRST) && (vallueSecond == NUMBER_TO_WIN_SECOND)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((vallueFirst == NUMBER_TO_WIN_FIRST && vallueSecond != NUMBER_TO_WIN_SECOND) ||
        (vallueFirst != NUMBER_TO_WIN_FIRST && vallueSecond == NUMBER_TO_WIN_SECOND)) {
        println("Вы выиграли утешительный приз")
    } else {
        println("Неудача!")
    }
}

const val NUMBER_TO_WIN_FIRST = 21
const val NUMBER_TO_WIN_SECOND = 12