//Kotlin Program to Reverse aNumber

package decision_making_and_loop
fun main() {
    var num = 123
    print("$num \n After Reverse \n")
    while (num != 0) {
        var temp = num % 10
        num = num / 10
        print(temp)
    }
}