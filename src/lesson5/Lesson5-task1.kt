package lesson5

fun main() {
    val mainQuestion = 2 + 2
    val proodBot = """
        |Для входа вам необходимо доказать, что вы не являетесь ботом
        |Введите ответ для решения данной задачи '2 + 2': 
        """.trimMargin()
    print(proodBot)
    val wordToEnter = readLine()!!.toInt()

    if ( mainQuestion == wordToEnter) {
        println("Добро пожаловать!!!")
    }
    else{
        println("Доступ запрещён!!!")
    }
}