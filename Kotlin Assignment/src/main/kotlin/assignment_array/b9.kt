//Kotlin Program to Find Transpose of a Matrix

package assignment_array

fun main() {
    val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    val transpose = Array(matrix[0].size) { IntArray(matrix.size) }

    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            transpose[j][i] = matrix[i][j]
        }
    }

    println("Matrix:")
    for (row in matrix) {
        for (cell in row) {
            print("$cell ")
        }
        println()
    }

    println("\nTranspose:")
    for (row in transpose) {
        for (cell in row) {
            print("$cell ")
        }
        println()
    }
}