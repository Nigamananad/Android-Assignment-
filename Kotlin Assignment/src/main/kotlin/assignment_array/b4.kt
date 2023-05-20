//Kotlin Program to Find Largest Element in an Array

package assignment_array


fun main() {
    val array = floatArrayOf(30f, 25f, 65f,55f)
    var largest = array[3]

    for (num in array) {
        if (largest < num) {
            largest = num
        }
    }
   println(largest)
}