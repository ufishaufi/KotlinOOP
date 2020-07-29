package Pertemuan1.app

import Pertemuan1.data.Car

fun main() {

    // Menggunakan Constructor
    val avanza = Car("Toyota")
    avanza.year = 2015
    //val almaz = Car("Wuling", 2019)

    // Menggunakan Secondary Constructor
    val almaz = Car("Wuling", "Almaz")

    // mencetak Primary Constructor
    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}