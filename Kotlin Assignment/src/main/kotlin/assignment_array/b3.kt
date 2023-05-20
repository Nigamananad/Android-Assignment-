//Kotlin Program to Calculate Average Using Arrays

package assignment_array

fun main() {
    val array = floatArrayOf(50f, 30f, 89f, 63f, 45f)
    var sum = 0f
    for (num in array) {
        sum += num
    }
    val count = array.size
    val avg = sum / count
    println(avg)
}