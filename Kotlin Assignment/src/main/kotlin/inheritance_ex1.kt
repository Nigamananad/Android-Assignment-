import java.util.Scanner

open class tops() {
    var scan = Scanner(System.`in`)
    var name: String = ""
    var age = scan.nextInt()
}

class student : tops() {
    var percen = scan.nextInt()


    fun showstudent() {
        println(
            """
            Name:$name
            Age:$age
            Percentage:$percen
        """.trimIndent()
        )
    }
}

class teacher : tops() {
    var salary = scan.nextInt()
    fun showteacher() {
        println(
            """
            Name:$name
            Age:$age
            Salary:$salary
        """.trimIndent()
        )
    }
}

fun main() {

    var s1 = student()


    s1.name = "Nigam"


    s1.showstudent()
    print("*********************\n")
    var t1 = teacher()

    t1.name = "Vishal"


    t1.showteacher()
}