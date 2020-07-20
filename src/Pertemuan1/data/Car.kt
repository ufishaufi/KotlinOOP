package Pertemuan1.data

class Car(paramBrand: String, paramName: String, paramYear: Int) { //constructor

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

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear

}