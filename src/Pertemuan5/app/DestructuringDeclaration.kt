package Pertemuan5.app

import Pertemuan5.data.Game
import Pertemuan5.data.Login
import Pertemuan5.data.MinMax
import kotlin.math.log

// Destructuring function
fun minMax(value1: Int, value2: Int): MinMax{
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

// Destructuring lambda function
fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {

//  Access Destruction Declaration
    val game = Game("Dota", 500000)
    val(name, price) = game
    println(name)
    println(price)

//  Access Destruction Function
//  val result = minMax(10, 100)
//  val min = result.min
//  val max = result.max

//  val (min, max) = minMax(10, 100)
//  println(min)
//  println(max)

//  variabel tidak digunakan user gunakan _(underscore)
    val (min, _) = minMax(10, 100)
    println(min)

//  Access Desctructing Lambda Parameter
    val login = Login("shaufi", "rahasia")
//  login(login) {
//      login -> login.username == "shaufi" && login.password == "rahasia"
//  }
    login(login) { (username, password) ->
        username == "shaufi" && password == "rahasia"}
}