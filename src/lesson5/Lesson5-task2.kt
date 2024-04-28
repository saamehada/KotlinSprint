package lesson5

fun main() {
    val userYear = readLine()!!.toInt()

    if (userYear - AGE_OF_MAJORITY <= YEAR_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    else{
        println("Вернуться на главный экран")
    }

}
const val AGE_OF_MAJORITY = 18
const val YEAR_OF_MAJORITY = 2006