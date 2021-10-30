package chap08.section1.limit

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean) : Animal(1)

class Box<out T: Animal>(val element: T) {
    fun getAnimal() : T = element
//    fun set(new :T){
//        element = new
//    }
}

fun main() {
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("a1.size = ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10)) // Cat은 Animal의 하위 자료형 - 공변성
    println("c2.element.size = ${c2.element.size}")

//    val c3: Box<Cat> = Box<Animal>(10) 불가능
//    val c4: Box<Any> = Box<Int>(10) 불가능2
}