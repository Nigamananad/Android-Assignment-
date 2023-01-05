package functions_Level_Basic


fun prime1(num: Int, num1: Int) {
    var number = num
    var bPrime: Int = 0
    var aPrime: Int = 0
    var c = 0
    for (i in 1..number) {
        if (number % i == 0) {
            c++
        }
    }
    if (c == 2) {
        aPrime = number
    } else {
        print("$number Not prime")
    }
    println()
    var number1 = num1
    var c1 = 0
    for (i in 1..number1) {
        if (number1 % i == 0) {
            c1++
        }
    }
    if (c1 == 2) {
        bPrime = number1
    } else {
        print("$number1 Not prime")
    }
    println()
    var sum = bPrime + aPrime
    println(sum)
}
fun main() {
    prime1(5, 8)
}