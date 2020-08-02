package Pertemuan5.app

import Pertemuan2.data.Employee
import Pertemuan2.data.Manager
import Pertemuan2.data.VicePresident
import Pertemuan4.data.Boss

fun main() {
    var employee: Employee = Employee("Shaufi")
    employee.sayHello("Eko")

    employee = Manager("Shaufi")
    employee.sayHello("Eko")

    employee = VicePresident("Shaufi")
    employee.sayHello("Eko")
}