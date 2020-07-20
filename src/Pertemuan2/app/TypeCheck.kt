package Pertemuan2.app

import Pertemuan2.data.Handphone
import Pertemuan2.data.Laptop

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is Handphone) {
        println("Handphone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is Handphone -> println("Handphone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Laptop")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(Handphone("Samsung"))

    println()

    printObjectWithWhen("Laptop")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(Handphone("Samsung"))

    printString("Shaufi")
    //printString(1)

    printStringSafe("Shaufi")
    printStringSafe(1)
}