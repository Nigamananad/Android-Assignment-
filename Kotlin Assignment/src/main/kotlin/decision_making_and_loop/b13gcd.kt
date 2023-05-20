//Kotlin Program to Find GCD of twoNumbers

package decision_making_and_loop

fun main() {
    var num1=10
    var num2=20
    var result=1

    var i=1
    while (i<=num1&&i<=num2)
    {

        if (num1%i==0 && num2%i==0)
        {
            result=i
        }
        ++i
    }
    print(result)
}