package Pertemuan4.data

sealed class Operation(val name: String)
class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Modulo : Operation("Modulo")