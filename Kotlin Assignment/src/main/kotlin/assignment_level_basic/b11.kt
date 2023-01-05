//Kotlin Program to Remove All Whitespaces from a String
package assignment_level_basic

fun main() {
    var sentance = "        NigamaNand Bhuyan       "
    println(sentance)
    println(sentance.count())
    var sen = sentance.trim()
    println(sen.length)
    println(sen)
}