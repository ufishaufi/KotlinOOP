package Pertemuan1.app

import Pertemuan1.data.Address

fun main() {
    val address1 = Address("jalan A", "Jakarta")
    val address2 = Address("Jalan A", "Jakarta", "Indonesia")

    println(address1.street)
    println(address2.street)
}