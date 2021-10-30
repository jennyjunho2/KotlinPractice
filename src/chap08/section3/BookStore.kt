package chap08.section3

import java.util.*

private fun calculatePrice(orig: Float, x: Float) : Unit {
    val result = orig - (orig * x)
    println("최종 가격은 \$${result}입니다.")
}

fun main() {
    val booksName = arrayOf("java", "c", "c++", "kotlin", "c#", "html")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f

    val scanner = Scanner(System.`in`)
    println("** Welcome to my Bookstore **")
    do {
        println(Arrays.toString(booksName))
        println("어떤 책을 원하시나요?")
        println("답변: ")

        val book = scanner.nextLine()

        if (booksName.contains(book.lowercase(Locale.getDefault()))) {
            println("선택하신 책은 $book 입니다. 가격은 \$200입니다.")
            println("학생과 선생님인 경우에 할인을 적용하고 있습니다." +
                    "\n당신의 직업은 무엇인가요(student, teacher, etc)?")
            println("답변: ")
            val occupation = scanner.nextLine()

            when (occupation.lowercase(Locale.getDefault())) {
                "student" -> calculatePrice(price, studentDiscount)
                "teacher" -> calculatePrice(price, teacherDiscount)
                else -> println("할인을 적용할 수 없습니다.\n최종가격은 \$200입니다.")
            }
        } else if (book == "exit" || book == "q") {
            break
        } else {
            println("죄송합니다. ${book}의 재고가 없습니다.")
        }
    } while (true)
}