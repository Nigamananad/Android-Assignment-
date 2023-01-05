//Kotlin Program to Check Whether a Numberis Palindrome or Not

package decision_making_and_loop

fun main() {
    var num = 9856
    var temp: Int
    print("$num \n After Reverse \n")

    var no=num.toString().reversed().toInt()
    println(no)

    if (num==no)
    {
        println("$num Is Palindrom")
    }
    else
    {
        println("$num Is Not Palindrom")
    }
}