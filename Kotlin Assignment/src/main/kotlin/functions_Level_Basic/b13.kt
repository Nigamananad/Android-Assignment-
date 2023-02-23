//Kotlin Program to Reverse a Sentence Using Recursion

package functions_Level_Basic

fun main() {
    var sentance = "NIGAMA NAND BHUYAN"
    var reversed = reverse(sentance)
    print("$sentance - Aftre Reversed - $reversed")
}

fun reverse(sentance: String): String {
    var sentances = sentance.reversed()
    return sentances
}