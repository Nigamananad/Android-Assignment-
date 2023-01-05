//Kotlin Program to Check Whether a Character is Alphabet or Not

package decision_making_and_loop

import java.util.Scanner

fun main()
{
    val scan=Scanner(System.`in`)
    print("Enter Particular One Character:")
    val ch=scan.next().single()

    if (ch in 'a'..'z' || ch in 'A'..'Z')
        println("'$ch' is Alphabet")
    else
        println("'$ch' is Not Alphabet")
}
