import com.sun.jdi.IntegerValue

//decimal to binary

fun main() {
    val num = 78

    // converting decimal to binary
    val binary = Integer.toBinaryString(num)
    println("$num in decimal = $binary in binary")
}