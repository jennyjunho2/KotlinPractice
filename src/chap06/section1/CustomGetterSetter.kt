package chap06.section1

import java.util.*

class User(_id : Int, _name : String, _age : Int){
    val id : Int = _id
    var name: String = _name
        set(value){
            println("The name was changed")
            field = value.uppercase()
        }
    var age : Int = _age
}

fun main() {
    val user1 = User(1, "kildong", 35)
    user1.name = "coco"
    println("user1.name = ${user1.name}")
}