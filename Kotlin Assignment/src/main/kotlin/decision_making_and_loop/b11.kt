//Kotlin Program to Generate Multiplication Table

package decision_making_and_loop

import java.util.Scanner

fun main()
{
    var scan=Scanner(System.`in`)
    print("The Input Is:")
    var no=scan.nextInt()

    for (i in 1..10)
    {
        val multi=no+i
        println("$no+$i=$multi")
    }
}