package Pertemuan5.data

data class Point(val x: Int, val y: Int)

operator fun Point.unaryPlus() = Point(x, y)

operator fun Point.unaryMinus() = Point(-x, -y)

operator fun Point.not() = Point(y, x)

operator fun Point.inc() = Point(x + 1, y + 1)

operator fun Point.dec() = Point(x - 1, y - 1)

