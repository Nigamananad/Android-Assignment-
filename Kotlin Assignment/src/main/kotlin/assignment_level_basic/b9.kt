// Kotlin Program to Check Whether a Number is Even or Odd

package assignment_level_basic

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    print("Enter Value:")
    var no = scan.nextInt()

    if (no % 2 == 0)
        print("$no is even. ")
    else
        println("$no is odd")

}
