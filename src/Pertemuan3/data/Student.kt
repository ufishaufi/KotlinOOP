package Pertemuan3.data

class Student(val name: String, val age: Int)

// class Student(val name: String, private val age: Int)

fun Student.sayHello(name: String){
    println("Hello $name, My name is ${this.name}, and my age is ${this.age}")
}

fun Student?.sayGoodBye(name: String) {
    if (this != null) {
        println("Hello $name, My name is ${this.name}, and my age is ${this.age}")
    }
}

//Extension Properties
val Student.upperName: String
    get() = this.name.toUpperCase()