package Pertemuan5.app

import Pertemuan5.data.*

fun main() {
    val fruit = Fruit(100)
    val fruit1 = Fruit(100)
    val fruit2 = fruit + fruit1
    println(fruit2)

    println(fruit2 - Fruit(10))

    println()
//    val plusPoint = Point(10, 20)
//    println(+plusPoint)
//
//    val minPoint = Point(10, 20)
//    println(-minPoint)
//
//    val notPoint = Point(20, 10)
//    println(!notPoint)
//
//    var addPoint = Point(10, 20)
//    println(++addPoint)
//
//    var minusPoint = Point(10, 20)
//    println(--minusPoint)
}