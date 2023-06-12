package data_structure.linked_list

fun main() {
    val lista = ListaEncadeada<Int>()

    lista.add(1)
    lista.add(2)
    lista.add(3)

    println(lista) // Saída: "1 -> 2 -> 3 -> null"

    lista.remove(2)

    println(lista) // Saída: "1 -> 3 -> null"

    println(lista.size()) // Saída: 2

    println(lista.isEmpty()) // Saída: false

    lista.clear()

    println(lista)
}
