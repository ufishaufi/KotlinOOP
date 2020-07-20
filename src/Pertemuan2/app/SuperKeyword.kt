package Pertemuan2.app

import Pertemuan2.data.Rectangle

fun main() {

    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("ParentCorner ${rectangle.parentCorner}")

    rectangle.printName()
}