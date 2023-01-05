class product {
    var pid: Int = 0
    var name: String = " "
    var des: String = " "
    var mrp: Int = 0
    var Discount: Float = 0.0f
    var saleprice:Float=0.0f

    fun show() {
        Discount=mrp*Discount/100
        saleprice=mrp-Discount
        println(
            """
            Id:$pid
            Name:$name
            Description:$des
            MRP:$mrp
            Discount:$Discount
            Sale_Price:$saleprice
        """.trimIndent()
        )
    }

    //By Method
    fun detail(id:Int,name: String,desc:String,mrp:Int,Disc:Float)
    {
        pid=id
        this.name=name
        des=desc
        this.mrp=mrp
        Discount=Disc
    }
    constructor()
    {

    }
}

fun main() {
    var pro=product()

    //by references
    pro.pid=101
    pro.name="Samsung"
    pro.des="kfhykfh"
    pro.mrp=30000
    pro.Discount=15.0f

    pro.show()

    var pro1=product()//by Method
    println("-------------------------------------------------------------")
    pro1.detail(5,"AC","Electronic",45000,10.0f)
    pro1.show()
}