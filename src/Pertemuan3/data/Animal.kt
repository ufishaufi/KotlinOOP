package Pertemuan3.data

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat : Animal() {
    override val name: String = "Cat"
    override fun run() {
        println("Cat run")
    }
}

class Dog : Animal(){
    override val name: String = "Dog"
    override fun run() {
        println("Dog run")
    }
}