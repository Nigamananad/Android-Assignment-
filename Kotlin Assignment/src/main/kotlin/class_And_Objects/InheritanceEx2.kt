//Assume a class cricketer is declared. Declare a derived class batsman from cricketer
// .Data member of batsman.
// Total runs, Average runs and best performance.
// Member functions input data, calculate average runs, Display data

package class_And_Objects

open class Cricketer{
    var totalRun:Int = 0
    var avg:Int = 0
    var avg1:Int = 0
    var match:Int = 0
    var notOut:Int = 0
    var perfom = ""

}

class Betsman : Cricketer(){

    fun calculateAvg(){
        avg1 = match - notOut
        avg = totalRun/avg1
    }

    fun display(){
        println("Total Run: $totalRun")
        println("Match: $match")
        println("Not-Out: $notOut")
        println("Average Runs: $avg")
        println("Perform: $perfom")
    }

}

fun main() {
    var b1 = Betsman()
    b1.totalRun = 1230
    b1.match = 250
    b1.notOut = 4
    b1.perfom = "Best Performance"
    b1.calculateAvg()
    b1.display()
}