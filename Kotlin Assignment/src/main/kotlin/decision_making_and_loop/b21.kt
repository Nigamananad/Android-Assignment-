//Kotlin Program to Display Prime Numbers Between Two Intervals

package decision_making_and_loop

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    print("Enter The Number:")
    var number = scan.nextInt()

    var c = 0
    for (i in 1..number) {
        for (j in 1..i) {
            if (i % j == 0) {
                c++
            }
        }
        if (c == 2) {
            print("$i\t")
        }
        c = 0
    }

}