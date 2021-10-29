package chap07.section2

sealed class Result{
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

class Status : Result()
class Inside : Result.Success("Status")

fun main() {
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

fun eval(result : Result) : String {
    when(result){
        is Status -> return "in progress"
        is Result.Success -> return result.message
        is Result.Error -> return result.message
    }
}