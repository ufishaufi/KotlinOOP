package Pertemuan1.data

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // Without Primary Constructor
    constructor(paramStreet: String, paramCity: String){
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this(paramStreet, paramCity) {
        country = paramCountry
    }
}