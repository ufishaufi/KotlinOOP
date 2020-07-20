package Pertemuan2.app

import Pertemuan2.data.Manager
import Pertemuan2.data.VicePresident

fun main() {

    val manager = Manager("Shaufi")
    manager.sayHello("Udil")

    val vicePresident = VicePresident("Udil")
    vicePresident.sayHello("Shaufi")
}