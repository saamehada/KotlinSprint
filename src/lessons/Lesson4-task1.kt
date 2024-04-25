package lessons

fun main() {
    val reservedTableToday = 13
    val reservedTableTomorrow = 9

    val availabilityOfTablesToday = reservedTableToday < NUMBER_OF_TABLES
    val availabilityOfTablesTomorrow = reservedTableTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $availabilityOfTablesToday")
    println("Доступность столиков на завтра: $availabilityOfTablesTomorrow")
}

const val NUMBER_OF_TABLES = 13