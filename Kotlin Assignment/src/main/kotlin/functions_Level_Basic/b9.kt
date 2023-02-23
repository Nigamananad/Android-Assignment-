//Kotlin Program to Find G.C.D Using Recursion

package functions_Level_Basic

fun main() {

   println(hcf(300,11))
}

fun hcf(n1: Int, n2: Int): Int {
    return if (n2 != 0)
        hcf(n2, n1 % n2)
    else
        n1
}