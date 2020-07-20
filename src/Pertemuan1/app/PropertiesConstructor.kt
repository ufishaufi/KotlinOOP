package Pertemuan1.app

import Pertemuan1.data.User

fun main() {

    val user1 = User("shaufi", "rahasia")
    val user2 = User("udil", "rahasia123")

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}