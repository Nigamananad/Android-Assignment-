//Kotlin Program to Calculate the Power of a Number

package decision_making_and_loop

import java.util.Scanner

fun main()
{
    val scan=Scanner(System.`in`)
    print("Enter Number:")
    val no=scan.nextInt()
    print("Enter Power of Number")
    val p=scan.nextInt()

    var num=1
    for (i in 1..p)
    {
        num *= no
    }
    print(num)
}
