//Kotlin Program to Find Factorial of a Number Using Recursion

package functions_Level_Basic

fun main(args: Array<String>) {
    println(factorial(5))
}

fun factorial(number: Int): Long {


    return if(number == 1){
        number.toLong()
    }
    else{
        number*factorial(number-1)
    }
}