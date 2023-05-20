//Create a class person having members name and age. Derive a class student having member percentage.
// Derive another class teacher having member salary.
// Write necessary member function to initialize, read and write data

package class_And_Objects

open class Person{
    var name:String = ""
    var age:Int = 0

}

class Student: Person(){
    var s1:Int = 0
    var s2:Int = 0
    var s3:Int = 0
    var s4:Int = 0
    var s5:Int = 0
    fun showP(){
        var total = s1+s2+s3+s4+s5
        var per  = (total * 100)/500
        println("Name: $name")
        println("Age: $age")
        println("Student Percentage: $per")
    }

}

class Teacher : Person(){

    var salary:Int = 0
    fun showT(){
        println("Name: $name")
        println("Age: $age")
        println("Teacher Salary is: $salary")
    }

}

fun main() {
    var st1 = Student()
    st1.name = "Nigam"
    st1.age = 17
    st1.s1 = 80
    st1.s2 = 70
    st1.s3 = 90
    st1.s4  =71
    st1.s5  = 60
    st1.showP()

    println()
    var t1 = Teacher()
    t1.name = "Nigamkumar"
    t1.age = 30
    t1.salary = 40000
    t1.showT()
}