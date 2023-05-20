//Kotlin Program to Calculate Standard Deviation

package assignment_array

import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val numArray = doubleArrayOf(10.0, 12.0, 13.0, 15.0, 20.0)
    val sd = calculateStandardDeviation(numArray)

    println("Standard Deviation = $sd")
}

fun calculateStandardDeviation(numArray: DoubleArray): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (num in numArray) {
        sum += num
    }

    val mean = sum / 5

    for (num in numArray) {
        standardDeviation += (num - mean).pow(2.0)
    }

    return sqrt(standardDeviation / 5)
}