//Kotlin Program to Swap Two Numbers
package assignment_level_basic

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Enter First No:")
    var first = scanner.nextInt()
    print("Enter Second No:")
    var second = scanner.nextInt()

    println("----------------------------------")

    var temp = first
    first = second
    second = temp
    println("After Swapping")
    println("First No:$first")
    println("Second No:$second")



}
