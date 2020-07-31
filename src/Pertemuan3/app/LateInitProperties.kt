package Pertemuan3.app

import Pertemuan3.data.Television

fun main(args: Array<String>) {
    val tv = Television()
//  bisa juga
//  tv.brand = "Samsung"
    tv.initTelevision("Samsung")
    println(tv.brand)
}