package data_structure.stack

data class No<T>(var noReference: No<T>?, var valor:T) {
    override fun toString(): String {
        return "$valor"
    }
}