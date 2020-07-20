package Pertemuan2.app

import Pertemuan2.data.ExecutiveCustomer
import Pertemuan2.data.PremiumCustomer

fun main() {

    val premiumCustomer = PremiumCustomer("Shaufi")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Shaufi", 100000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}