package assignment_level_basic

import java.util.Scanner

fun main() {
    var sc=Scanner(System.`in`)
    print("Enter Decimal No:")
    var num=sc.nextFloat()

    print("%.4f".format(num))
}