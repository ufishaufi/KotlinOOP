package Pertemuan1.data

class Person() {

    // inisiasi properties
    var firstName: String = ""
    var middleName: String? = null // tidak di rekomendasikan
    var lastName: String = ""

    fun sayHello(name: String): Unit {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(firstNameParam: String, lastNameParam: String): Unit {
        println("Hello $firstNameParam $lastNameParam, My Name is $firstName")
    }

    fun run(): Unit {
        println("I'm Run")
    }

    fun getFullName(): String{
        return "$firstName $middleName $lastName"
    }
}