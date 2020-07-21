package Pertemuan3.data

interface Interaction {
    val name: String
    fun sayHello(name: String): Unit

    /*concreate function
    fun sayHello(name: String): Unit {
        println("Hello $name, My name is ${this.name}")
    }
    */
}
interface Go {
    fun go() {
        println("Go!")
    }
}

interface GoNew : Interaction {
    fun goNew(): Unit {
        println("Go ${this.name}!")
    }
}
interface moveA {
    fun move() = println("Move A")
}

interface moveB {
    fun move() = println("Move B")
}

class Human(override val name: String): Interaction, Go, moveA, moveB {
    override fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }

    override fun move() {
        super<moveA>.move()
        super<moveB>.move()
        println("Move Human")
    }
}

