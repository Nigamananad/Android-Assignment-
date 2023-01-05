//Kotlin Program to Count Number of Digits in an Integer

package decision_making_and_loop

import java.util.Scanner


fun main()
{
    val scan=Scanner(System.`in`)
    print("Enter The Number:")
    var num=scan.nextInt()
    var c = 0
//    val no=num.toString().count().toInt()
//    print(no)
    while (num!=0){
        var temp = num % 10
        num = num / 10
        ++c
    }
    println(c)
}
