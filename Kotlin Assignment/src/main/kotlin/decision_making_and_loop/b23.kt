//Kotlin Program to Display Armstrong Number Between Two Intervals

package decision_making_and_loop

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)

    print("Enter Range:")
    var no = scan.nextInt()

    var num = 1
    var temp = 0
    var sum = 0
    for (j in 1..no) {
        var no1=j
        var count = no1.toString().count().toInt()
        var no2=no1

        while (no1 != 0) {
            temp = no1 % 10
            no1 = no1 / 10
            num = 1
            for (i in 1..count) {
                num *= temp
            }
            sum = sum + num
        }
        if (sum == no2) {
            print("$no2\t")
        }
        num = 1
        temp = 0
        sum = 0
    }

}