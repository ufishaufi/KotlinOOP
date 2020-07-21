package Pertemuan3.app

import Pertemuan3.data.SuperTeacher
import Pertemuan3.data.Teacher

fun main() {
    val teacher = SuperTeacher("Shaufi")
    println(teacher.name)
    // error karena tidak bisa mengakses modifier private
    // teacher.teach()
    teacher.test()
}