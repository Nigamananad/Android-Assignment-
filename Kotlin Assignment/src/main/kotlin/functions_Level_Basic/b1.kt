package functions_Level_Basic

import java.util.Scanner

fun main() {
    max()
}
fun max()
{
    var scan=Scanner(System.`in`)
    println("Value of A:")
    var a=scan.nextInt()
    println("Value of B:")
    var b=scan.nextInt()

    if(a>b)
    {
        print("A is Max")
    }
    else
    {
        print("B is Max")
    }
}