package basic.fluxcontrol

class TestClass

fun cases(obj: Any){
    when(obj){
        1 -> println("Number One")
        "Hello" -> println("Hello World!")
        is Long -> println("Type: Long")
        !is String -> println("Type: !(String)")
        else -> println("Unknow")
    }
}

fun whenExpression(obj: Any):Any{
    val result = when(obj){
        is Int -> 99
        is Double -> 3.14
        is String -> "It's a String"
        true -> false
        else -> "Other"
    }
    return result
}

fun main() {

    cases(1)
    cases("Hello")
    cases("Olá")
    cases(TestClass())

    println("-----------------")

    println( whenExpression(65))
    println(whenExpression("Name"))
    println(whenExpression(true))
    println(whenExpression(false))

}