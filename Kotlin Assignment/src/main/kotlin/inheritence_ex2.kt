fun main() {
rec()
}

var count = 0
fun rec() {
    count++
    if (count <= 10) {
        println("This Number $count")
        rec()
    }
}