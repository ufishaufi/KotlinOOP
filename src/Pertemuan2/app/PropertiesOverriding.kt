package Pertemuan2.app

import Pertemuan2.data.Rectangle
import Pertemuan2.data.Shape
import Pertemuan2.data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape1 = Rectangle()
    println(shape1.corner)

    val shape2 = Triangle()
    println(shape2.corner)
}