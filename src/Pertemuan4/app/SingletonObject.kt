package Pertemuan4.app

import Pertemuan4.data.Application
import Pertemuan4.data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Shaufi"))
    a()
    b()

    // call inner Object
    println(Application.Utilities.toUpper("Shaufi"))

}
    fun a(){
        println(Utilities.name)
    }
    fun b() {
        println(Utilities.name)
    }
