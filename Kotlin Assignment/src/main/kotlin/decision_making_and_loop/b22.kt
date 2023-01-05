//Kotlin Program to Check ArmstrongNumber

package decision_making_and_loop

import java.util.Scanner

fun main()
{
    var scan=Scanner(System.`in`)

    print("Enter Number:")
    var no=scan.nextInt()
    var no1=no
    var count=no.toString().count().toInt()

    var num=1
    var temp=0
    var sum=0
    while (no != 0) {
        temp = no % 10
        no = no / 10
        num=1
        for (i in 1..count  )
        {
            num *= temp
        }
        println(num)
        sum =sum + num
    }
    if (sum==no1)
    {
        println("$no1 Armstrong Number")
    }
    else
    {
        print("$no1 not Armstrong")
    }
}