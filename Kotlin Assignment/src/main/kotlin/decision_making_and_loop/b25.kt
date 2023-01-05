//Kotlin Program to Make a Simple CalculatorUsing switch...case

package decision_making_and_loop

import java.util.Scanner

fun main() {

    var scan = Scanner(System.`in`)
    print("Enter A:")
    var a = scan.nextInt()
    print("Enter B:")
    var b = scan.nextInt()

    print("Choose Any One:- '+','-','*','/': ")
    var ch = scan.next()
    var c: Int = 0
    when (ch) {
        "+" -> c = a + b
        "-" -> c = a - b
        "*" -> c = a * b
        "/" -> c = a / b

    }
    print("$a$ch$b=$c")
}