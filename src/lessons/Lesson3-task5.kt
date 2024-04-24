package lessons

fun main() {
    val famousLine = "D2-D4;0"

    println(famousLine)


    val whereFrom = "D2"
    val whereTo = "D4"
    val numStep = "0"

    println(whereFrom)
    println(whereTo)
    println(numStep)


// variant - 2

    val famousLine2 = "D2-D4;0"

    println(famousLine2)


    val parts = famousLine2.split("-", ";")

    println(parts[0])
    println(parts[1])
    println(parts[2])

}