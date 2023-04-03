package basic

class Calculator(){
    val x:Int? = null
    val y:Int? = null

    fun somar(x:Int, y:Int):Int{
        return x + y
    }

    fun subtratir(x:Int, y:Int) = x - y


    fun dividir(x:Int, y:Int) = x / y


    fun multiplicar(x:Int, y:Int) = x * y

    fun somarWithPrefix(x:Int, y: Int, prefix:String = "info"):String{
        val r:Int = y + x
        return "$prefix = $r"
    }

}

fun main() {

    val calculator = Calculator()

    println(calculator.multiplicar(56, 43))
    println(calculator.somar(65, 76))
    println(calculator.dividir(746, 543))
    println(calculator.subtratir(65, 9))

    println(calculator.somarWithPrefix(54, 65))
    println(calculator.somarWithPrefix(54, 65, "Resultado"))

}