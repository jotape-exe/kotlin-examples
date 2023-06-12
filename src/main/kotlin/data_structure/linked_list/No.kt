package data_structure.linked_list

data class No<T>(var proximoNo:No<T>? = null, var valor: T) {

    override fun toString(): String {
        return "$valor"
    }

    constructor(novoValor:T) : this(
        valor = novoValor
    )

    constructor(novoValor: T, no: No<T>) : this (
        valor = novoValor,
        proximoNo = no
    )
}
