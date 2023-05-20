package data_structure.queue

fun main() {
    val fila = Fila<String>()

    fila.clear()

    println(fila.poll())
    //println(fila.remove())

    fila.add("Sring 1")
    fila.add("Sring 2")

    println("peek ${fila.peek()}")

    fila.add("Sring 3")
    fila.add("Sring 4")

    println("tamanho ${fila.size()}")

    fila.remove()

    fila.add("Sring 5")

    println(fila)


}