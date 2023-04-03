package basic

class MutableStack<T>(vararg itens: T){

    private val elements = itens.toMutableList()

    fun push(element: T) = elements.add(element)

    fun peek(): T = elements.last()

    fun pop(): T = elements.removeAt(elements.size-1)

    fun isEmpty(): Boolean = elements.isEmpty()

    fun size(): Int = elements.size

    override fun toString(): String = "MutableStack(${elements.joinToString()}})"
}

fun <T> mutableStackOf(vararg elements: T) = MutableStack(*elements)

fun main() {
    val names = mutableStackOf("Jhon", "Peter", "Marco", "Levi", "Eren", "Ziggs", "Ekko", "Twitch")

    println(names.pop())

    println(names.peek())

}