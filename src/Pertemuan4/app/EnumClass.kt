package Pertemuan4.app

import Pertemuan4.data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val all: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(all.toList())

    man.showDesc()
    woman.showDesc()
}