package lessons

fun main() {
    val muscleGroupHandsAndBody = NUMBERS_DAY + 4
    val muscleGroupBackAndLegs = NUMBERS_DAY + 2
    val vallueHandsAndBody = NUMBERS_DAY + 4 % 2
    val vallueBackAndLegs = NUMBERS_DAY + 2 % 2


    val answer = ((vallueHandsAndBody == 1 || vallueBackAndLegs == 1) && (vallueHandsAndBody > vallueBackAndLegs))
    val answer1= ((vallueHandsAndBody == 1 || vallueBackAndLegs == 1) && (vallueHandsAndBody < vallueBackAndLegs))


    val mainQuestion = """
        |Упражнения для рук: $answer
        |Упражнения для ног: $answer1
        |Упражнения для спины: $answer 
        |Упражнения для пресса: $answer1
        """.trimMargin()


    println(mainQuestion)
}

const val NUMBERS_DAY = 5