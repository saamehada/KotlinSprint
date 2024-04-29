package lesson4

fun main() {
    val damageOfTheShip = readln().toBoolean()
    val numbersPeople = readln()!!.toInt()
    val numbersBox = readln()!!.toInt()
    val weatherForShip = readln().toBoolean()


    val mainAnswer = (damageOfTheShip == DAMAGE_SHIP) && ((numbersPeople <= NUMBERS_PEOPLE_MAX) && (numbersPeople >= NUMBERS_PEOPLE_MIN))
            && (numbersBox >= NUMBERS_BOXES) && ((weatherForShip == WEATHER_TODAY) || (weatherForShip == WEATHER_TODAY2))
            && (damageOfTheShip == DAMAGE_SHIP2) && ((weatherForShip == WEATHER_TODAY) || (weatherForShip == WEATHER_TODAY2))
            && (numbersBox >= NUMBERS_BOXES) && (numbersPeople == NUMBERS_PEOPLE_MAX)


    println(mainAnswer)
}

const val NUMBERS_PEOPLE_MIN = 55
const val NUMBERS_PEOPLE_MAX = 70
const val NUMBERS_BOXES = 50

const val DAMAGE_SHIP: Boolean = false
const val DAMAGE_SHIP2: Boolean = true
const val WEATHER_TODAY: Boolean = false
const val WEATHER_TODAY2: Boolean = true
