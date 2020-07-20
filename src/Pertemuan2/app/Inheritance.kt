package Pertemuan2.app

import Pertemuan2.data.Manager2
import Pertemuan2.data.VicePresident2

fun main() {

    val manager = Manager2("Shaufi")
    manager.sayHello("Udil")

    val vicePresident = VicePresident2("Udil")
    vicePresident.sayHello("Shaufi")
}