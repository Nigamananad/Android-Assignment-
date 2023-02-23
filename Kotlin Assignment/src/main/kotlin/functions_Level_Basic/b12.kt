//Kotlin Program to Convert Binary Number to Octaland vice-versa

package functions_Level_Basic

fun main() {
    var binaryno: Long = 11110110
    var octal = binarytooctal(binaryno)
    println("Binary No :$binaryno  To Octal No: $octal")

}

fun binarytooctal(binaryno: Long): Int {
    var binaryno = binaryno
    var decimalno = 0
    var octalNumber = 0
    var i = 0
    var remainder: Long


    while (binaryno.toInt() != 0) {
        remainder = binaryno % 10
        binaryno /= 10
        decimalno += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }

    i = 1

    while (decimalno > 0) {
        val r = decimalno % 8           //r=246%8  , r=6								r=30%8 , r=6								r=3%8, r=3
        octalNumber += r * i                //octalNumber=0+6*1, octalNumber=6			    octalNumber=6+6*10, octalNumber=66			octalNumber=66+3*100, octalNumber=366
        decimalno /= 8                      //decimalNumber=246/8, decimalNumber =30		decimalNumber=30/8, decimalNumber =3		decimalNumber=3/8, decimalNumber =0
        i *= 10                             //i=1*10,  i=10								    i=10*10,  i=100								i=100*10,  i=1000
    }

    return octalNumber
}