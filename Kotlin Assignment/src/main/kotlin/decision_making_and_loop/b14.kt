package decision_making_and_loop

fun main() {
    var num1 = 72
    var num2 = 120
    var lcm: Int

    lcm = if (num1 > num2) num1 else num2

    while (true) {
        if (lcm % num1 == 0 && lcm % num2 == 0) {
            print("LCM of $num1 and $num2 is $lcm")
            break
        }
        ++lcm
    }
}