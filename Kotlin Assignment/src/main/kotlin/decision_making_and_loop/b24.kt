//Kotlin Program to Display Factors of a Number

package decision_making_and_loop

import java.util.Scanner

fun main()
{
    var scan=Scanner(System.`in`)
    print("Enter No:")
    var no=scan.nextInt()

    for (i in 1..no)
    {
        if (no%i==0)
        {
            print(" $i\t")
        }
    }

}
