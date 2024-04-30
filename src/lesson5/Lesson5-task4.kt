package lesson5

fun main() {
    val isName = readln()
    val isPassword = readln()

    if (isName != MAIN_NAME) {
        println("Вам следует зарегестрироваться в систему!")
    } else if (isPassword == MAIN_PASSWORD) {
        println("Вы успешно зашли в систему!")
    } else {
        println("Вы ввели некорректные данные!")
    }
}

const val MAIN_NAME = "Zaphod"
const val MAIN_PASSWORD = "PanGalactic"

