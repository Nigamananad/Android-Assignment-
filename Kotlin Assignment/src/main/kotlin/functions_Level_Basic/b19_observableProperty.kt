package function

import kotlin.properties.Delegates

class Company{
    var name:String by Delegates.observable("Company Name"){
        property, oldValue, newValue -> println("$oldValue -> $newValue")
    }
}

fun main() {
    val v1 = Company()
    v1.name = "PetHouse"
    v1.name = "Animal House"
}