package Pertemuan1.data

// Constructor
// class Car(paramBrand: String, paramYear: Int = 2020){
class Car(paramBrand: String, paramName: String, paramYear: Int) {

    // initializer block
    init {
        println("Car $paramBrand dibuat")
    }

    // Secondary Constructor
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020){
        println("Secondary Constructor 1")
    }
    // another Secondary Constructor
    constructor(paramBrand: String): this(paramBrand, "") {
        println("Secondary Constructor 2 ")
    }

    // Inisialiasi constructor
    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear

}