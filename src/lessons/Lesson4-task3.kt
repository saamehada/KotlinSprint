package lessons

fun main() {
    val weatherTodayNeed: Boolean = true
    val tentFindingNeed: Boolean = true
    val airHumidityNeed: Int = 20
    val seasonInTheYearNeed: String = "winter"

    val averageVallue = (weatherTodayNeed == WEATHER_TODAY) && (tentFindingNeed == TENT_FINDING) && (airHumidityNeed == AIR_HUMIDITY) && (seasonInTheYearNeed == SEASON_IN_THE_YEAR)
    println("Благоприятные ли условия сейчас для роста бобовых? $averageVallue")

}

const val WEATHER_TODAY: Boolean = true
const val TENT_FINDING: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON_IN_THE_YEAR: String = "not winter"