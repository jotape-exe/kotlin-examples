package functions.scopefunc

fun logCreation(dev: Dev) = println("${dev.name} as created!")

fun main() {
    val marcus = Dev("Marcus", "C++")
        .also {
            logCreation(it)
        }
}