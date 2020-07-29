package Pertemuan1.app

import Pertemuan1.data.Person

fun main() {

    // Membuat Object
    val shaufi = Person()
    val udil = Person()
    val ucil = Person()

    // Mengakses Object
    println(shaufi)
    println(udil)
    println(ucil)

    //Memanipulasi Properties kalau tipenya mutable
    shaufi.firstName = "Shaufi"
    udil.firstName = "Udil"
    ucil.firstName = "Ucil"

    //Mengakses Properties
    println(shaufi.firstName)
    println(udil.firstName)
    println(ucil.firstName)


}