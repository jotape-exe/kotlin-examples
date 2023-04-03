package basic.fluxcontrol

fun main() {
    for (i in 10..20){
        print(" [$i] ")
    }
    println()

    for (i in 0 until 7){
        print(" [$i] ")
    }
    println()

    for (i in 0..14 step 2){
        print(" [$i] ")
    }
    println()

    for (i in 9 downTo 3 step 3){
        print(" [$i] ")
    }
    println()

    for (i in 'a'..'f'){
        print(" [$i] ")
    }
    println()

    val age = 18

    if (age in 1..17){
        println("Menor de idade!")
    } else if(age !in 1..17){
        println("Maior de idade")
    }
}