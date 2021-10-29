package chap06.section3

class Hobby(val name : String)

object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello world!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Initial!")
    }
}

class CCustomer {
    companion object{
        const val HELLO = "hello" // 상수 표현
        var name = "Joosol"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello World!")
    }
}

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}