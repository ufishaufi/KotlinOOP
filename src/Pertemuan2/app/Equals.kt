package Pertemuan2.app

import Pertemuan2.data.Company

fun main() {

    val company1 = Company("Shaufi")
    val company2 = Company("Shaufi")

    println(company1 == company2)
    println(company1 == company1)
}