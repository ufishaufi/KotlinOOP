package Pertemuan1.data

// membuat class
class Person() {

    // deklarasi properties
    var firstName: String = ""
    var middleName: String? = null // tidak di rekomendasikan
    var lastName: String = ""

    //membuat Function di dalam class
    fun sayHello(name: String): Unit {
        println("Hello $name, My Name is $firstName")
    }
    //membuat Function overloading
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