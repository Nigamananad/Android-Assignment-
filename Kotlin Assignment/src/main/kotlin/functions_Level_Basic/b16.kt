//WAP to check whether the number lies in range. (in operator)

package functions_Level_Basic

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Enter Number :-")
    val no = scan.nextInt()

    if (no in 1..10) {
        print("Number is Between range 1 to 10")
    } else {
        print("Number is Not Between range 1 to 10")
    }
}