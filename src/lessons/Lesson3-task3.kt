package lessons

fun main() {
    val mainVallue = 6


    val theMultiplicationTable = """
        |$mainVallue * 1 == 6 
        |$mainVallue * 2 == 12
        |$mainVallue * 3 == 18
        |$mainVallue * 4 == 24
        |$mainVallue * 5 == 30
        |$mainVallue * 6 == 36
        |$mainVallue * 7 == 42
        |$mainVallue * 8 == 48
        |$mainVallue * 9 == 54
        |$mainVallue * 10 == 60
        """.trimMargin()


    println(theMultiplicationTable)
}