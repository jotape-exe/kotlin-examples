package recursion


fun main(){

    fun fatorial(numero:Int): Int{
        if (numero == 0 || numero == 1){
            return 1
        }
        return numero * fatorial(numero-1)
    }

    println(fatorial(5))
}

