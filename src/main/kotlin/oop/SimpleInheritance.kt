package oop

open class Dog{
    open fun sayHello(){
        println("wow wow!")
    }
}

class ChoWChow: Dog(){
    override fun sayHello() {
        println("WOF WOF!")
    }
}

fun main() {
    val dog:Dog = ChoWChow()

    dog.sayHello()
}