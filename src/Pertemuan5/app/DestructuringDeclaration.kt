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

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Dota", 500000)

    val(name, price) = game
    println(name)
    println(price)

//    val result = minMax(10, 100)
//    val min = result.min
//    val max = result.max
//  varibel tidak digunakan user _(underscore)
    val (min, _) = minMax(10, 100)
//    println(max)
    println(min)

    val login = Login("shaufi", "rahasia")
//    login(login) {
//        login -> login.username == "shaufi" && login.password == "rahasia"
//    }
    login(login) { (username, password) ->
        username == "shaufi" && password == "rahasia"}
}