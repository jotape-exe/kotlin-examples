package data_structure.queue

data class No<T>(var noReference: No<T>? = null, var valor:T) {
    override fun toString(): String {
        return "$valor"
    }
    constructor(novoValor: T) : this(
        valor = novoValor
    )
}
