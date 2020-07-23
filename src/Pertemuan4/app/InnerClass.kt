package Pertemuan4.app

import Pertemuan4.data.Boss

fun main() {
    val boss = Boss("Shaufi")
    val employee = boss.Employee("Udil")
    val employee2 = boss.Employee("Ucil")

    val boss2 = Boss("Rudi")
    val employee3 = boss2.Employee("Udil")
    val employee4 = boss2.Employee("Ucil")

    employee.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}