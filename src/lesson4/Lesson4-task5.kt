package lesson4

fun main() {
    println("В качестве входных данных используй информацию, введенную через консоль: ")

    println("Введите, есть ли повреждение у корабля")
    val damageOfTheShip = readln().toBoolean()

    println("Введите число экипажа")
    val numbersPeople = readln().toInt()

    println("Введите количество ящиков провизии")
    val numbersBox = readln().toInt()

    println("Введите благоприятность погоды для плавания (благоприятная или неблагоприятная)")
    val weatherForShip = readln().toBoolean()


    val mainAnswer =
        ((damageOfTheShip == DAMAGE_SHIP) && ((numbersPeople <= NUMBERS_PEOPLE_MAX) && (numbersPeople >= NUMBERS_PEOPLE_MIN)) &&
                (numbersBox >= NUMBERS_BOXES) && (weatherForShip == WEATHER_TODAY)) ||
                ((damageOfTheShip != DAMAGE_SHIP) && (weatherForShip != WEATHER_TODAY) &&
                        (numbersBox >= NUMBERS_BOXES) && (numbersPeople == NUMBERS_PEOPLE_MAX))


    println(mainAnswer)
}

const val NUMBERS_PEOPLE_MIN = 55
const val NUMBERS_PEOPLE_MAX = 70
const val NUMBERS_BOXES = 50

const val DAMAGE_SHIP: Boolean = false
const val WEATHER_TODAY: Boolean = false
