package Pertemuan1.app

import Pertemuan1.data.Person

fun main() {

    val shaufi = Person() //Membuat Object
    shaufi.firstName = "Shaufi" //Memanipulasi Properties

    val udil = Person()
    udil.firstName = "Udil"

    val ucil = Person()
    ucil.firstName = "Udil"

    println(shaufi.firstName) //Mengakses Properties
    println(udil.firstName)
    println(ucil.firstName)


}