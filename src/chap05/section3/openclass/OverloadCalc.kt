package chap05.section3

fun main() {
    val calc = Calc()
}

class Calc {
    fun add(x: Int, y : Int) : Int = x+y
    fun add(x: Double, y: Double) : Double = x+y
    fun add(x: Int, y : Int, z : Int) : Int = x+y +z
    fun add(x: String, y: String) : String = x+y
}
