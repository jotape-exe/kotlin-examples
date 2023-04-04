package functions

data class Config(val host:String, val port:String)

fun main() {
    val config = Config("http://localhost:","3000")

    with(config){
        println(host+port)
    }

    //run example
    config.run {
        println(host+port)
    }
}