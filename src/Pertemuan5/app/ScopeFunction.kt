package Pertemuan5.app

import Pertemuan3.data.Student

fun main() {
    val student= Student("Shaufi", 15)
    val result: String = student.let{
        "Name ${it.name}, Age ${it.age}"
//        println(it.name)
//        println(it.age)
//        "Shaufi"
    }
    println(result)

    val result1: String = student.run {
        "Name ${this.name}, Age ${this.age}"
    }

    println(result1)

    val result2: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }

    println(result2)

    val result3: Student = student.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result3)

    val result4: String = with(student){
        "Name ${this.name}, Age ${this.age}"
    }

    println(result4)
}