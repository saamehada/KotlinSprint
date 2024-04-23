package lesson_2

fun main(){
    val hourDeparture = 9
    val minuteDeparture = 39
    val trainPathMinute = 457
    val arrivalHours = trainPathMinute / 60
    val partRemainder = arrivalHours * 60
    val remainingMinutes = minuteDeparture + (trainPathMinute - partRemainder)
    val arrivalOfTheTrainHours = hourDeparture + arrivalHours
    val timeMinute = remainingMinutes / 60
    val mainTimeHour = timeMinute + arrivalOfTheTrainHours
    val mainTineMinutes = remainingMinutes % 60

    println("$mainTimeHour:$mainTineMinutes")
}