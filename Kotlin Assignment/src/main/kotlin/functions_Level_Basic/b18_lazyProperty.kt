package function

class Lazy{
    val myName:String by lazy {
        println("Welcome to Lazy Declaration!")
        "Lazy Declare!!"
    }
}

fun main() {
    var obj = function.Lazy()
    println(obj.myName)
    println()
    println("Second time declaration" +"--"+ obj.myName)
}