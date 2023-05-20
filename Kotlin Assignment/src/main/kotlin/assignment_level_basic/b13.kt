package assignment_level_basic

fun main() {
    print("Enter  Sentence : ")
    var str= readln()
    var isnullempty=str.isNullOrEmpty()
    if (isnullempty)
    {
        print("str is empty")
    }
    else
    {
        print(str)
    }

}