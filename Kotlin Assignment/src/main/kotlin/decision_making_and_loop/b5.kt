package decision_making_and_loop

import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    println("a(x*x)+ bx + c = 0,")
    println("Enter value 'a' is Real Number Not Enter 0!")
    var output:String
    var sc = Scanner(System.`in`)
    print("Enter a= ")
    var a=sc.nextDouble()
    print("Enter b= ")
    var b=sc.nextDouble()
    print("Enter c= ")
    var c=sc.nextDouble()
    var root1:Double
    var root2:Double

    while (a==0.0){
        print("ReEnter 'a' value a= ")
        a = sc.nextDouble()
    }

    var determinant  = (b*b) - 4*a*c
    if(determinant>0){
        root1 = (-b + sqrt(determinant)) / (2 * a)
        root2 = (-b - sqrt(determinant)) / (2 * a)

        output = "root1 = %.2f and root2 = %.2f".format(root1, root2)
    }
    else if (determinant==0.0){
        root1 = -b/2*a
        output = "root1 = root2 = %.2f".format(root1)
    }
    else{
        val realPart = -b /(2 * a)
        val imaginaryPart = sqrt(-determinant)/(2*a)
        output = "root1 = %.2f+%.2fi and root2 = %.2f-%.2fi".format(realPart, imaginaryPart, realPart, imaginaryPart)
    }
    println(output)
}