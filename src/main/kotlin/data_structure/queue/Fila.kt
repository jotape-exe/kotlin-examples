package data_structure.queue

import java.lang.NullPointerException

data class Fila<T> (var noReferenciaEntrada: No<T>? = null, var tamanho:Int = 0){

    fun add(valor:T){
        val novoNo = No(valor)
        novoNo.noReference = noReferenciaEntrada
        noReferenciaEntrada = novoNo
        tamanho++
    }

    fun remove():T?{
        if (!isEmpty()){
            var noAuxiliar = noReferenciaEntrada
            var primeiroNo = noReferenciaEntrada
            while (true){
                if (primeiroNo?.noReference != null){
                    noAuxiliar = primeiroNo
                    primeiroNo = primeiroNo.noReference
                } else{
                    noAuxiliar?.noReference = null
                    break
                }
            }
            tamanho--
            return primeiroNo?.valor
        }
        else{
            throw NullPointerException("${Fila::class.java} is empty, cannot remove!")
        }
    }

    fun isEmpty():Boolean = noReferenciaEntrada == null

    fun poll():T?{
        if (!isEmpty()){
            var noAuxiliar = noReferenciaEntrada
            var primeiroNo = noReferenciaEntrada
            while (true){
                if (primeiroNo?.noReference != null){
                    noAuxiliar = primeiroNo
                    primeiroNo = primeiroNo.noReference
                } else{
                    noAuxiliar?.noReference = null
                    break
                }
            }
            tamanho--
            return primeiroNo?.valor
        }
        return null
    }

    fun peek():No<T>? = noReferenciaEntrada

    fun size() = tamanho

    fun clear(){
        noReferenciaEntrada = null
        tamanho = 0
    }

    override fun toString(): String {
        var strRetorno = ""
        var noAuxiliar = noReferenciaEntrada

        while (noAuxiliar != null) {
            strRetorno += "[No={valor = ${noAuxiliar.valor}}]-->"
            noAuxiliar = noAuxiliar.noReference
        }

        strRetorno += "null"
        return strRetorno
    }
}
