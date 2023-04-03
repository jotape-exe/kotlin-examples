package basic.fluxcontrol

class Player(var hp:Int, val atk:Int, val name:String)

class Server(val players:MutableList<Player>){
    operator fun iterator():Iterator<Player>{
        return players.iterator()
    }
}

fun main() {

    //FOR
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()

    for (i in 0..32){
        if (i % 2 == 0){
            pares.add(i)
        } else{
            impares.add(i)
        }
    }

    /*
    * for(i in pares){
    *   println(i)
    * }
    * */
    println("Pares -> $pares")
    println("Impares -> $impares")

    //WHILE - DO WHILE

    val p1 = Player(340, 20, "Paladino")
    val p2 = Player(150, 65, "Mago")

    var count = 0

    while (true){
        println("Round -> $count [${p1.name} | HP - ${p1.hp}] --- [${p2.name} | HP - ${p2.hp}]")
        if (p1.hp < 0){
            println("${p2.name} Wins!")
            break
        } else if(p2.hp < 0){
            println("${p1.name} Wins!")
            break
        }

        p2.hp -= p1.atk
        p1.hp -= p2.atk
        count++
    }

    do {
        println("Round -> $count [${p1.name} | HP - ${p1.hp}] --- [${p2.name} | HP - ${p2.hp}]")
        if (p1.hp < 0){
            println("${p2.name} Wins!")
            break
        } else if(p2.hp < 0){
            println("${p1.name} Wins!")
            break
        }

        p2.hp -= p1.atk
        p1.hp -= p2.atk
        count++
    } while (true)

    // ITERATOR
    val players = mutableListOf(p1, p2)
    val serverSA = Server(players)

    for (player in players){
        println("Player Found! -> ${player.name}")
    }

}