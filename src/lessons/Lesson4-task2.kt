package lessons

fun main() {
    val weightProduct1 = 20
    val volumeProduct1 = 80

    val weightProduct2 = 50
    val volumeProduct2 = 100

    val averageProduct1 = (weightProduct1 in WEIGHT_AVERAGE_MIN..WEIGHT_AVERAGE_MAX) && (volumeProduct1 < AVERAGE_VOLUME)
    println("Груз с весом $weightProduct1 и объёмом $volumeProduct1 соответствует категории 'Average': $averageProduct1")

    val averageProduct2 = (weightProduct2 in WEIGHT_AVERAGE_MIN..WEIGHT_AVERAGE_MAX) && (volumeProduct2 < AVERAGE_VOLUME)
    println("Груз с весом $weightProduct2 и объёмом $volumeProduct2 соответствует категории 'Average': $averageProduct2")

}

const val WEIGHT_AVERAGE_MIN = 35
const val WEIGHT_AVERAGE_MAX = 100
const val AVERAGE_VOLUME = 100