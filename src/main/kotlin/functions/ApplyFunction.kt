package functions
data class Dev(var name:String, var lang:String){
    constructor() : this("","")
}

fun main() {
    val jake = Dev()
    val descrptionObj = jake.apply {
        name = "Jake"
        lang = "Kotlin"
    }.toString()

    println(descrptionObj)

}