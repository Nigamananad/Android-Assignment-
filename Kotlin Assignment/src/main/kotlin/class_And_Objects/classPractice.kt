package class_And_Objects

class Product{

    var pId:Int = 0
    var name:String = ""
    var decs:String = ""
    var mrp:Int = 0
    var discount:Int = 0
    var salePrice:Int = 0

    //
    constructor(){

//        this.pId = readLine()!!.toInt()
//        this.name = readln()
//        this.decs = readln()
//        this.mrp = readLine()!!.toInt()
//        this.discount = readLine()!!.toInt()

    }

    constructor(pid:Int, name:String, decs:String, mrp:Int, discount:Int){
        println("""
            ProductID: $pid
            ProductName: $name
            ProductDecs: $decs
            ProductMRP: $mrp
            ProductDiscount: $discount
        """.trimIndent())
        var disPrice = (mrp * discount)/100
        salePrice = mrp - disPrice
        println("Product_SalePrice: $salePrice")
    }

    fun showDetail(){
        println("""
            ProductID: $pId
            ProductName: $name
            ProductDecs: $decs
            ProductMRP: $mrp
            ProductDiscount: $discount
        """.trimIndent())
        var disPrice = (mrp * discount)/100
        salePrice = mrp - disPrice
        println("Product_SalePrice: $salePrice")
    }

    fun pDetails( pid:Int, Name:String, Decs:String, Mrp:Int, Discount:Int){
        pId = pid
        name = Name
        decs = Decs
        mrp = Mrp
        discount = Discount
    }

}

fun main() {
    // BY Reference
    var p1 = Product()
    println()
    println("By Reference")
    p1.pId = 1
    p1.name = "Asus"
    p1.decs = "TUF Gaming Laptop"
    p1.mrp = 56000
    p1.discount = 40
    p1.showDetail()

    println()
    // By Method
    var p2 = Product()
    println()
    println("By Method")
    p2.pDetails(2,"Dell","Laptop Basic use",40000,30)
    p2.showDetail()

    println()
    println("Constructor Without Parameter")
    //Constructor Without Parameter
    var p3 = Product()

    p3.showDetail()


    println()
    println("Constructor With Parameter")
    //Constructor With Parameter
    var p4 = Product(4,"A.C.","Cooling",25000,20)


}