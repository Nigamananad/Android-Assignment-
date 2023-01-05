//Read language code from command line and print “Hello” if EN , print “Salut” if FR, print “Ciao” if IT. (when)

package decision_making_and_loop

fun main() {

    print("Enter Character:")
    var ch = readLine().toString()

    when (ch) {
        "EN" -> print("Hello")
        "FR"-> print("salut")
        "IT"-> print("Ciao")

    }
}