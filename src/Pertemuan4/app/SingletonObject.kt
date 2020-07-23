package Pertemuan4.app

import Pertemuan4.data.Application
import Pertemuan4.data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Shaufi"))
    A()
    B()

    // call inner Object
    println(Application.Utilities.toUpper("Shaufi"))

    // call companion Object
    println(Application.toUppers("Shaufi "))
    println(Application.Companion.toUppers("Shaufi"))


}
    fun A(){
        println(Utilities.name)
    }
    fun B() {
        println(Utilities.name)
    }
