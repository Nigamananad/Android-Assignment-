//Kotlin Program to Sort Elements in Lexicographical Order (Dictionary Order)

package decision_making_and_loop

fun main() {
    var lexi= arrayOf("Rukshar","Nigam","Monika","Anik")

    for (i in 0..2)
    {
        for (j in i+1..3)
        {
            if (lexi[i] > lexi[j])
            {
                var temp=lexi[i]
                lexi[i]=lexi[j]
                lexi[j]=temp
            }
        }
    }
    println("Lexicographical Order:")
    for (i in 0..3)
    {
        println(lexi[i])
    }
}