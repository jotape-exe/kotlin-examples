package basic.collectionskt

val bank = mutableMapOf(3412L to "User 1", 5646L to "User 2", 5443L to "User 3")
val bankUsersCpoy:Map<Long, String> = bank

fun main() {
    for (account in bankUsersCpoy){
        println(account)
    }

    bank.put(54873L, "User 43")

    //println(bankUsersCpoy.put(3453L, "User 4"))

    println(bankUsersCpoy.get(3412L))

    println(bankUsersCpoy)
}