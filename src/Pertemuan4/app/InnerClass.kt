package Pertemuan4.app

import Pertemuan4.data.Boss

fun main() {
    val boss = Boss("Shaufi")
    val employee = boss.Employee("Udil")
    val employee1 = boss.Employee("Ucil")

    val boss1 = Boss("Rudi")
    val employee2 = boss1.Employee("Udil")
    val employee3 = boss1.Employee("Ucil")

    employee.hi()
    employee1.hi()
    employee2.hi()
    employee3.hi()
}