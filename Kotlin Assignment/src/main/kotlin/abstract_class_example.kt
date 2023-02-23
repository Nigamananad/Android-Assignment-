abstract class shape(var num1:Float=0f,var num2:Float=0f)
{
    abstract fun area()
}
class circle(num:Float):shape(num1 = num)
{
    override fun area()
    {
        println("area of circle : ${3.14*num1*num1}")
    }
}
class rectangle(length:Float,breadth:Float):shape(num1=length, num2 = breadth)
{
    override fun area() {
        println("area of rectangle: ${num1*num2}")
    }
}
fun main() {
var c1=circle(3.25f)
c1.area()

    var r1=rectangle(3.145f,5f)
    r1.area()
}