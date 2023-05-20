package assignment_level_basic

fun main(args: Array<String>) {
    val str="Nigamanand Kangresh Bhuyan"
    val ch='a'
    var frequency=0

    for (i in str.indices)
    {
        if (ch==str[i])
        {
            ++frequency
        }
    }
    print("Frequency of $ch = $frequency")
}