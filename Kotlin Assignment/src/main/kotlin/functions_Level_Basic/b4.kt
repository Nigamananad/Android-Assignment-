//Kotlin Program to Display Prime Numbers Between Intervals Using Function

package functions_Level_Basic

import java.util.*

fun prime()
{
    var scan= Scanner(System.`in`)
    print("Enter The Number:")
    var number=scan.nextInt()

    var c=0
    for (i in 1..number)
    {
        for (j in 1..i) {
            if (i % j == 0) {
                c++
            }
        }
        if (c==2)
        {
            print("$i\t")
        }
        c=0
    }
}
fun main() {
    prime()
}