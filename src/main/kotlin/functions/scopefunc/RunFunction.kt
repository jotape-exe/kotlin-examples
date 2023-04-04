package functions.scopefunc

fun randomFunc(param:String?){
    println("Parametrer -> $param ")

    param?.run {
        println("is empty? ${isEmpty()}")
        println("Length: $length")
        println("$param == \"ramdom\" ? ${param == "random"} ")
    }
}

fun main() {
    randomFunc("random")
    randomFunc("Aleatorio")
    randomFunc(null)
}