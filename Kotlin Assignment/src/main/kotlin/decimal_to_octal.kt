import java.util.Scanner

//Main function Entry Point of Program
fun main() {

    val sc = Scanner(System.`in`)

    print("Enter Decimal Number  : ")
    var decimalNumber: Int = sc.nextInt()
    var octal = decimaltooctal(decimalNumber)
}
fun decimaltooctal(decimalNumber:Int):Int
{
    var decimalNumber=decimalNumber
    var octalNumber = 0
    var i = 1

    //Convert Decimal to Octal
    while (decimalNumber > 0) {
        val r = decimalNumber % 8           //r=246%8  , r=6								r=30%8 , r=6								r=3%8, r=3
        octalNumber += r * i                    //octalNumber=0+6*1, octalNumber=6			    octalNumber=6+6*10, octalNumber=66			octalNumber=66+3*100, octalNumber=366
        decimalNumber /= 8                      //decimalNumber=246/8, decimalNumber =30		decimalNumber=30/8, decimalNumber =3		decimalNumber=3/8, decimalNumber =0
        i *= 10                                 //i=1*10,  i=10								    i=10*10,  i=100								i=100*10,  i=1000
    }

    //Print Octal Number
    println("Octal is : $octalNumber")
    return octalNumber
}