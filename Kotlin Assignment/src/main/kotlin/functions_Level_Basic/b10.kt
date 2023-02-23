//Kotlin Program to Convert Binary Number toDecimal and vice-versa

package functions_Level_Basic

fun main() {
    var binaryno:Long=10011100100
    var desimal= binarytodecimal(binaryno)
    println("Binary No :$binaryno To Decimal No: $desimal ")
}
fun binarytodecimal(binaryno:Long):Int
{
    var binaryno=binaryno
    var decimalno=0
    var i=0
    var remainder:Long

    while (binaryno.toInt()!=0)
    {
        remainder=binaryno%10
        binaryno=binaryno/10
        decimalno=decimalno+(remainder * Math.pow(2.0,i.toDouble())).toInt()
        ++i
    }
    return decimalno
}