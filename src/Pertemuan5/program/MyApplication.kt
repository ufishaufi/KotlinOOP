package Pertemuan5.program

import Pertemuan5.annotations.Fancy

@Fancy(author = "Shaufi")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name $version"
}