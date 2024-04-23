package lessons_1

fun main(){
    val summ = 70000
    val percent = 16.7
    val numberOfYears: Double = 20.0
    val hardPercent: Double = summ * Math.pow((1 + (percent / 100)), numberOfYears)
    System.out.println("%.3f". format(hardPercent))
}