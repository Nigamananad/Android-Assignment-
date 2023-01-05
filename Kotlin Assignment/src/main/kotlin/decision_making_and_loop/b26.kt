//Kotlin Program to Count the Number of Vowels and Consonants in a Sentence

package decision_making_and_loop

fun main() {
    var sentence ="Abjhsdbknmxjkdcnxhnigamanandbhuyan"
    var count=0
    var canso=0

    for (i in 0..sentence.length-1) {
        var sen=sentence[i]
        if (sen == 'a' || sen == 'e' || sen == 'i' || sen == 'o' || sen == 'u'
            || sen == 'A' || sen == 'E' || sen == 'I' || sen == 'O' || sen == 'U') {
            count++
        }
        else{
            canso++
        }

    }
    println("Vowels:$count")
    println("Cansonant:$canso")

}