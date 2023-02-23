//Kotlin Program to calculate the power using recursion

package functions_Level_Basic

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Enter Base:")
    val base = scan.nextInt()
    print("Enter Power")
    val powerRaised = scan.nextInt()
    val result = power(base, powerRaised)
    print("$base^$powerRaised = $result")
}

fun power(base: Int, powerRaised: Int): Int {
    if (powerRaised != 0)
        return base * power(base, powerRaised - 1)
    else
        return 1
}