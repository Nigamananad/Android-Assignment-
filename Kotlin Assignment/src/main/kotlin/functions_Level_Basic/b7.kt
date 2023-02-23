//Kotlin Program to Find the Sum of Natural Numbers using Recursion
package functions_Level_Basic

import java.util.*

fun naturee(n: Int): Int {
    return if (n != 0) {
        n + naturee(n - 1)
    } else {
        0
    }
}

fun main() {
    println(naturee(10))
}