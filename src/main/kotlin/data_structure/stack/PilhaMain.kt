package data_structure.stack

fun main() {
    val pilha = Pilha<String>()

    pilha.push("Valor 1")
    pilha.push("Valor 12")
    pilha.push("Valor 123")
    pilha.push("Valor 1234")
    pilha.push("Valor 12345")
    pilha.push("Valor 123456")

    println("pilha-> $pilha")

    println(pilha.peek())

    println(pilha.pop())

    println(pilha.size())

    println("pilha-> $pilha")

    println(pilha.isEmpty())

    pilha.clear()

    println(pilha)

    println(pilha.isEmpty())
}