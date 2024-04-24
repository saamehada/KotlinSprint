package lessons

fun main() {
    val mark1 = 3
    val mark2 = 4
    val mark3 = 5
    val students = 4
    val summNums = 2 * mark1 + mark2 + mark3
    val summNumsFloat = summNums.toFloat()
    val averageValue = summNumsFloat / students
    println("%.2f".format(averageValue))
}