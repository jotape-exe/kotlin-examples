package basic

class CardGame{
    fun printAllCards(vararg cards:String){
        println("----- DECK -----")
        println()
        var count = 1
        for (c in cards){
            println("$count- $c")
            count++
        }
    }

    fun addAllCards(collectionCards:MutableList<String>, vararg cards:String) = collectionCards.addAll(cards)

    fun logCards(vararg entries:String) = printAllCards(*entries)

    fun cardlength(str:String?):Int = str?.length ?: 0



}

fun main() {
    val cardGame = CardGame()

    val collectionCards:MutableList<String> = mutableListOf()

    cardGame.printAllCards(
        "Knight", "Fireball", "Snowball", "Goblin Barrel",
        "Walkyrie", "Inferno Tower", "Princess", "Goblin Gang"
    )
    cardGame.addAllCards(collectionCards, "Knight", "Fireball", "Snowball", "Goblin Barrel",
        "Walkyrie", "Inferno Tower", "Princess", "Goblin Gang")

    println(collectionCards)

    cardGame.logCards("Knight", "Fireball", "Snowball", "Goblin Barrel",
        "Walkyrie", "Inferno Tower", "Princess", "Goblin Gang")

    val str = null

    println(cardGame.cardlength(str))

}