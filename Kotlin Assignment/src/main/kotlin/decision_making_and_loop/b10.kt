package decision_making_and_loop

import java.util.Scanner

fun main()
{
    val scan=Scanner(System.`in`)
    print("Enter No:")
    val  no=scan.nextInt()
    var fact=1
    for (no in 1..no)
    {
        fact  *=no
    }
    print("Faactorial:$fact")

}