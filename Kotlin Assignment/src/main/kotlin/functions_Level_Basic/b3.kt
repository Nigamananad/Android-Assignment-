//WAP to multiply two number with validation if number if not null. (not null)

package functions_Level_Basic

import java.util.Scanner

fun multi() {
    print("1st No:-")
    val no1 = readLine()
    if (no1 == "") {
        print("1st No is Empty")
    }
    var b = no1.toString().toInt()
    print("2nd No:-")
    val no2 = readLine()
    if (no2 == "") {
        print("2nd No is Empty")
    }
    var a = no2.toString().toInt()

    print(a * b)
}

fun main() {
    multi()
}