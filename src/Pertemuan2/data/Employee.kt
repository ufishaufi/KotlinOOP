package Pertemuan2.data

// inheritance
open class Employee(val name: String) {
    /*fun sayhello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }*/

    open fun sayHello(name: String){
        println("Hello $name, My name is ${this.name}")
    }
}

final class Manager2(name: String) : Employee(name)
final class VicePresident2(name: String) : Employee(name)

open class Manager(name: String) : Employee(name){
    // Override Function tapi tidak bisa di akses selain di function override ini
    final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}
class SuperManager(name: String) :Manager(name){
    // ERROR
    /*override fun sayHello(name: String) {
        println("Hello $name, My name is Super Manager ${this.name}")
    }*/
}
final class VicePresident(name: String) : Employee(name) {
    // Override Function
    override fun sayHello(name: String) {
        println("Hello $name, My name is Vice President ${this.name}")
    }
}