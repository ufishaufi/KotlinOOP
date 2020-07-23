package Pertemuan4.data

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty

class Account(desc: String = "") {
    val name: String by lazy {
        println("Name is called")
        "Shaufi"
    }

    // observable Properties
    var desc :String by Delegates.observable(desc){ property, oldValue, newValue ->
            println("${property.name} is change from $oldValue to $newValue")
    }
}