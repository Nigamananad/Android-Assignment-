//Kotlin Program to Check Whether an Alphabet is Vowel or Consonant


package decision_making_and_loop
fun main()
{
    val ch='a'
    println("Enter A Perticular Single Character:")

    if (ch=='a'||ch=='e' ||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U')
        print("The Character '$ch' is a Vowel")
    else
        print("The Character '$ch' is a Consonant")
}
