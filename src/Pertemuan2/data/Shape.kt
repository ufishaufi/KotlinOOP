package Pertemuan2.data

open class Shape {
    open val corner: Int = -1
    open fun printName() {
        println("This is shape")
    }
}

class Rectangle : Shape() {
    override val corner: Int = 4
    // super properties
    val parentCorner: Int = super.corner

    // super function
    override fun printName() {
        println("This is Rectangle")
        super.printName()
    }
}

class Triangle : Shape() {
    override val corner: Int = 3
}

