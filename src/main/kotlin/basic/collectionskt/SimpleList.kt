package basic.collectionskt

val systemUsers = mutableListOf("joao", "root", "user")
val sudoers:List<String> = systemUsers //ReadOnly

fun main() {
    systemUsers.remove("user")
    println(sudoers)
}