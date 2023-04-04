package functions.scopefunc

fun printUpper(str:String){
    print("$str -> ${str.uppercase()}")
}

fun printNonNull(str: String?){
    println("Result -> \"$str\": ")

    str?.let {
        printUpper(it)
    }
}

fun doubleLet(strOne:String?, strTwo:String?){
    strOne?.let { firstIt ->
        strTwo?.let { secondIt ->
            printUpper("[ $firstIt ]--[ $secondIt]")
        }

    }
}


fun main() {

    val strEmpty = "String".let {
        printUpper(it)
        it.isEmpty()
    }

    println(" Is empty? $strEmpty")

    printNonNull(null)
    printNonNull("Any")

    println()

    doubleLet("first value", "last value")

}