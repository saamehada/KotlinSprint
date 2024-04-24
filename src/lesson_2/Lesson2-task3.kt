package lesson_2

fun main(){
    val hourDeparture = 9
    val minuteDeparture = 39
    val trainPathMinute = 457
    val numbersInHour = 60


    val arrivalHours = trainPathMinute / numbersInHour
    val partRemainder = arrivalHours * numbersInHour
    val remainingMinutes = minuteDeparture + (trainPathMinute - partRemainder)
    val arrivalOfTheTrainHours = hourDeparture + arrivalHours
    val timeMinute = remainingMinutes / numbersInHour
    val mainTimeHour = timeMinute + arrivalOfTheTrainHours
    val mainTineMinutes = remainingMinutes % numbersInHour


    println("$mainTimeHour:$mainTineMinutes")
}