package data_structure.linked_list

class ListaEncadeada<T> {
    private var primeiroNo: No<T>? = null
    private var ultimoNo: No<T>? = null
    private var tamanho: Int = 0

    fun add(valor: T) {
        val novoNo = No(valor)

        if (primeiroNo == null) {
            primeiroNo = novoNo
            ultimoNo = novoNo
        } else {
            ultimoNo?.proximoNo = novoNo
            ultimoNo = novoNo
        }

        tamanho++
    }

    fun remove(valor: T): Boolean {
        var noAtual = primeiroNo
        var noAnterior: No<T>? = null

        while (noAtual != null) {
            if (noAtual.valor == valor) {
                if (noAnterior != null) {
                    noAnterior.proximoNo = noAtual.proximoNo
                    if (noAnterior.proximoNo == null) {
                        ultimoNo = noAnterior
                    }
                } else {
                    primeiroNo = noAtual.proximoNo
                    if (primeiroNo == null) {
                        ultimoNo = null
                    }
                }

                tamanho--
                return true
            }

            noAnterior = noAtual
            noAtual = noAtual.proximoNo
        }

        return false
    }

    fun size(): Int {
        return tamanho
    }

    fun isEmpty(): Boolean {
        return tamanho == 0
    }

    fun clear(){
        this.tamanho = 0
        this.primeiroNo = null
        this.ultimoNo = null
    }

    override fun toString(): String {
        var resultado = ""

        var noAtual = primeiroNo
        while (noAtual != null) {
            resultado += "[No{conteudo=" + noAtual.valor +"}]--->"
            noAtual = noAtual.proximoNo
        }

        resultado += "null"

        return resultado
    }

}
