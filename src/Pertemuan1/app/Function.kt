package Pertemuan1.app

import Pertemuan1.data.Person

fun main() {
    val shaufi = Person()
    shaufi.firstName = "Muhammad"
    shaufi.middleName = "Shaufi"
    shaufi.lastName = "Imanulhaq"

    shaufi.sayHello("Shaufi")
    shaufi.run()

    val fullname = shaufi.getFullName()
    println(fullname)
}