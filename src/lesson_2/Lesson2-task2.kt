package lesson_2

fun main(){
    val numberOfPeople = 50
    val numberOfStudents = 30
    val peoplesSalaries = 30000
    val studensSalaries = 20000
    val expenseEsmployee = peoplesSalaries * numberOfPeople
    val expenseEsmployeeStudents = studensSalaries * numberOfStudents
    val generalPeopleAndStudents = expenseEsmployee + expenseEsmployeeStudents
    val generalPeopleAndStudents2 =  numberOfPeople + numberOfStudents
    val averageValue = generalPeopleAndStudents / generalPeopleAndStudents2


    println(expenseEsmployee)
    println(generalPeopleAndStudents)
    println(averageValue)
}