//Kotlin Code To Create Pyramid andPattern

package decision_making_and_loop

fun main() {
    for (i in 1..5) {
        for(k in i until 5)
        {
            print(" ")
        }

        for (j in 1 until 2*i) {
            print("*")
        }
        println()
    }
}