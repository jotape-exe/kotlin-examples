package exhandling

fun divise(x:Int, y:Int){
    try {
        println(x / y)
    } catch (ex: ArithmeticException){
        println(ex.message)
    } finally {
        println("End TryCatch")
    }
}

fun main() {
    divise(4,0)

    // Try Expression
    val dv:Int? = try { 6 / 0 } catch (ex: ArithmeticException) { null }

    println(dv)

    val age = 15

    if (age < 18){
        throw IllegalAccessException("Menor de idade")
    }
}