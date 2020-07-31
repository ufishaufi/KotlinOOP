package Pertemuan3.app

import Pertemuan3.data.Product

fun main() {
    val product = Product("Indomie", 2500, "Food")
    println(product)

    val product2 = product.copy(name = "Supermie")
//  println(product)
    println(product2)
}