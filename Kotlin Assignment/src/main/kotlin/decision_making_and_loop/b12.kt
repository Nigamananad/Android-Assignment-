//Kotlin Program to Display FibonacciSeries

package decision_making_and_loop

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    print("A:")
    var a = scan.nextInt()
    print("B:")
    var b = scan.nextInt()
    for (i in 1..10) {
        var c = a + b
        var temp = c
        a = b
        b = c
        println(" $c")
    }
}