package chap08.section2

import java.util.*

fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")

    fruits
        .filter{it.startsWith("a")}
        .sortedBy {it}
        .map { it.uppercase(Locale.getDefault()) }
        .forEach {println(it)} // Method Chaining
}