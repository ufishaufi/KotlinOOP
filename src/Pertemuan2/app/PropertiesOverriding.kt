package Pertemuan2.app

import Pertemuan2.data.Rectangle
import Pertemuan2.data.Shape
import Pertemuan2.data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)
}