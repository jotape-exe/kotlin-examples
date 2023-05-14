package oop.specialclasses

interface EventKotlin{
    fun click()
}

class Form{
    fun eventKotlin(e:EventKotlin){}
    fun eventJava(e:EventJava){}
}

class AnonimousClass {
    fun main(){

        Form().eventKotlin(object : EventKotlin{
            override fun click() {
                TODO("Not yet implemented")
            }

        })

        //SAM Conversion - Single Abstract Method
        //Para interfaces com a apenas um metodo
        Form().eventJava { TODO("Not yet implemented") }
    }
}