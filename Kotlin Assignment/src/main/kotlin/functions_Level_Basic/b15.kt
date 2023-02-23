// WAP to print length of String with smart cast. (use “is” operator)

package functions_Level_Basic

fun main(args: Array<String>) {

    var str: String? = "tops tech"

    //println(str?.length)
    /*if(str!=null){
        println(str.length)
    }*/

    if (str is String) {
        println(str.length)
    }
}
