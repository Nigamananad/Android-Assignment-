package collection

data class ProductList(
    var pID:Int,
    var pCategory:String,
    var pName:String,
    var price:Int,
    var discount:Int,
    var finalPrice:Int
)

fun main() {
    val productList = mutableListOf<ProductList>()

    productList.add(ProductList(12,"Laptop","Asus F15",60000,20,48000))
    productList.add(ProductList(12,"Mobile","Asus ROG",50000,20,40000))

    for (product in productList){
        println("""
            ProductID: ${product.pID}
            Product Category: ${product.pCategory}
            Product Name: ${product.pName}
            Product Actual Price: ${product.price}
            Product Discount: ${product.discount}
            Product Final Price: ${product.finalPrice}
            
        """.trimIndent())
    }
}