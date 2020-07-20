package Pertemuan2.data

class Person {

    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String): Unit {
        //this keyword merefer properties
        println("Hello $name, My Name is ${this.firstName}")
    }

    fun sayHello(firstName: String, lastName: String): Unit {
        //this keyword merefer properties function
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run(): Unit {
        println("I'm Run")
    }

    fun getFullName(): String{
        return "$firstName $middleName $lastName"
    }
}