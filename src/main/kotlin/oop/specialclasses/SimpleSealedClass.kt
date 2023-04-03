package oop.specialclasses

sealed class Mammal(val name:String)

class Dog(val dogName:String): Mammal(dogName)
class Human(val humanName:String): Mammal(humanName)

fun printMammal(mammal: Mammal){
    println(mammal.name)
}

fun main() {
    val dog = Dog("Zeux")
    printMammal(dog)
}