package assignment_array

fun main(args: Array<String>) {
    val rows = 2
    val columns = 3
    val firstMatrix = arrayOf(intArrayOf(2, 30, 4), intArrayOf(10, 2, 30))
    val secondMatrix = arrayOf(intArrayOf(5, 5, -10), intArrayOf(5, 6, 10))

    val sum = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sum[i][j] = firstMatrix[i][j] * secondMatrix[i][j]
        }
    }

    println("Sum of two matrix is: ")
    for (row in sum) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}