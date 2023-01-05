//WAP to find max value using function as express

package functions_Level_Basic

import java.util.Scanner

fun main() {
    max()
}
fun max()
{
    val scan=Scanner(System.`in`)
    println("Value of A:")
    val a=scan.nextInt()
    println("Value of B:")
    val b=scan.nextInt()

    if(a>b)
    {
        print("A is Max")
    }
    else
    {
        print("B is Max")
    }
}