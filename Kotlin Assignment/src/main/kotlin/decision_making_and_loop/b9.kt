//Kotlin Program to Calculate the Sum of Natural Numbers

package decision_making_and_loop

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Enter No:")
    val n = scan.nextInt()
    var sum = 0
    for (i in 0..n) {
        sum += i
    }
    print(sum)
}
