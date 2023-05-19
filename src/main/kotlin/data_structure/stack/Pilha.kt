package data_structure.stack

data class Pilha<T> (var noReferenciaEntrada: No<T>? = null, var tamanho:Int = 0){

    fun push(novoValor: T){
        val novoNo = No(noReferenciaEntrada, novoValor)
        noReferenciaEntrada = novoNo
        tamanho++
    }

    fun peek():No<T>? = noReferenciaEntrada

    fun pop():No<T>?{
        if (!isEmpty()){
            val noRemovido: No<T>? = noReferenciaEntrada
            noReferenciaEntrada = noReferenciaEntrada?.noReference
            tamanho--
            return noRemovido
        }
        return null!!
    }

    fun clear(){
        noReferenciaEntrada = null
        tamanho = 0
    }

    fun size() = tamanho

    fun isEmpty(): Boolean = noReferenciaEntrada == null

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

