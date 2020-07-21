package Pertemuan3.app

import Pertemuan3.data.Television

fun main(args: Array<String>) {
    val tv = Television()
    // tv.brand = "Samsung" bisa juga
    tv.initTelevision("Samsung")
    println(tv.brand)
}