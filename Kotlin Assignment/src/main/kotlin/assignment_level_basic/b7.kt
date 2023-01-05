//Kotlin Program to Compute Quotient and Remainder

package assignment_level_basic

import java.util.Scanner

fun  main()
{

    val no =Scanner(System.`in`)

    print("Enter No1: ")
    val no1=no.nextInt()
    print("Enter No2: ")
    val no2=no.nextInt()

    val division= no1/no2
    val module= no1%no2

    println("Quotient : $division")
    println("Remainder : $module")
}