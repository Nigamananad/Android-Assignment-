// Kotlin Program to Check Leap Year

package decision_making_and_loop

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Enter Year:")
    val lyear = scan.nextInt()
    if (lyear % 400 == 0)
        print("$lyear Leap Year")
    else if (lyear % 100 == 0)
        print("$lyear Not A Leap Year")
    else if (lyear % 4 == 0)
        print("$lyear Leap Year")
    else
        print("$lyear Not A Leap Year")
}