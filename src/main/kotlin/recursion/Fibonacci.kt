package recursion

fun main(){

    fun fibonacci(numero:Int):Int{
        //1º caso base do calculo do fibonacci
        if (numero == 0){
            return 1
        //2º caso base do calculo do fibonacci
        } else if (numero == 1){
            return 2
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2)
    }

    println(fibonacci(5))
}