package basic

class Client(val id: Int, val name: String, val cpf: String){
    override fun toString(): String {
        return "\n{\n" +
                "   id:$id\n" +
                "   name:'$name'\n" +
                "   cpf:'$cpf'\n" +
                "}"
    }
}

fun main() {

    val c1 = Client(1, "João", "645.412.312-09")
    val c2 = Client(2, "Pedro", "432.754.432-03")
    val c3 = Client(3, "Santana", "345.635.342-01")
    val c4 = Client(4, "Verissimo", "023.433.123-00")


    val clients:MutableList<Client> = mutableListOf(c1, c2, c3, c4)

    println(clients)
}