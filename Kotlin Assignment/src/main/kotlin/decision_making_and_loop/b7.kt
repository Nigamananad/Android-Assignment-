//Kotlin Program to Check Whether a Number is Positive or Negative

package decision_making_and_loop

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    println("Enter a Number:")
    val number = scan.nextInt()

    if (number > 0) {
        print("you have entered Posetive number")
    } else
        if (number == 0)
            print("You have entered 0")
        else
            print("you have entered negative number")

}
