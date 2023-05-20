//Kotlin Program to Check Whether a Number is Primeor Not

package decision_making_and_loop

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    print("Enter The Number:")
    var number = scan.nextInt()

    var c = 0
    for (i in 1..number) {
        if (number % i == 0) {
            c++
        }
    }
    if (c == 2) {
        print("Prime")
    } else {
        print("Not prime")
    }
}