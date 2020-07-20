package Pertemuan1.app

import Pertemuan1.data.Car

fun main() {

    // use constructor
    val avanza = Car("Toyota")
    avanza.year = 2015

    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}