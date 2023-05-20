package class_And_Objects

open class Products{
    var pID:Int = 0
    var pName:String = ""
    var moduleNo:Int = 0
    var pPrice:Int = 0
}

open class Category:Products(){
    var Cat:String = ""
}

class PD: Category(){
    fun Dis(){
        println("Product Category: $Cat")
        println("Product ID: $pID")
        println("Product Name: $pName")
        println("Product ModuleNumber: $moduleNo")
        println("Product Price: $pPrice")
    }
}

fun main() {
    var p1 = PD()
  //  p1.Cat =
}