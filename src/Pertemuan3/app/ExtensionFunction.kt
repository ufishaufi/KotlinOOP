package Pertemuan3.app

import Pertemuan3.data.Student
import Pertemuan3.data.sayHello
import Pertemuan3.data.upperName

fun main() {
    val student = Student("Shaufi", 16)
    student.sayHello("Udil")

    println(student?.upperName)
}