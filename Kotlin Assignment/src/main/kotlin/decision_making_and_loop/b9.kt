//Kotlin Program to Calculate the Sum of Natural Numbers

package decision_making_and_loop

import java.util.Scanner

fun main()
{
    val scan=Scanner(System.`in`)
    print("Enter No1:")
    val no1=scan.nextInt()
    print("Enter No2:")
    val no2=scan.nextInt()

    if (no1>=1 && no2>=1)
        print("Total: ${no1 + no2}")
    else
        print("Please Enter The Natural No!")
}
