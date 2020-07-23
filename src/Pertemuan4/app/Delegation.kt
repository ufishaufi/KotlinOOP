package Pertemuan4.app

import Pertemuan4.data.MyBase
import Pertemuan4.data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Shaufi")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Shaufi")
    baseDelegate.sayGoodbye("Shaufi")
}