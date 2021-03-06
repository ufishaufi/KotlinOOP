package Pertemuan4.app

import Pertemuan4.data.Application

typealias App = Application
typealias Aplikasi = App
typealias App1 = Pertemuan4.data2.Application

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")
    val app1 = App1("Kotlin App v2")

    sayHello { "Shaufi" }
}