package Pertemuan5.app

import Pertemuan5.data.Fruit

fun main() {
    val fruit = Fruit(100)
    val fruit1 = Fruit(100)
    val fruit2 = fruit + fruit1
    println(fruit2)

    println(fruit2 - Fruit(10))
}