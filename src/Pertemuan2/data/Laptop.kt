package Pertemuan2.data

class Laptop(val name: String)

open class Handphone(val name: String)

class SmartPhone(name: String, val os: String) : Handphone(name)