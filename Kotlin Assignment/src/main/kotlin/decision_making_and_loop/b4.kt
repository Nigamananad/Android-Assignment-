//Kotlin Program to Find the Largest Among Three Numbers

package decision_making_and_loop

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Enter Value of A:")
    val a = scan.nextInt()

    print("Enter Value of B:")
    val b = scan.nextInt()

    print("Enter Value of C:")
    val c = scan.nextInt()

    if (a > b && a > c)
        println("A is Largest No")
    else if (b > a && b > c)
        println("B is Largest No")
    else if (c > a && c > b)
        println("C is Largest No")
    else if (a == b)
        println("A and B are Equal")
    else if (b == c)
        println("B and C are Equal")
    else
        println("C and A are Equal")

}
