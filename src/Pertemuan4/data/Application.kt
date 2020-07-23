package Pertemuan4.data

class Application(val name: String) {

    companion object {
        fun toUppers(name: String): String {
            return name.toUpperCase()
        }
    }

    object Utilities {
        fun toUpper(name: String): String {
            return name.toUpperCase()
        }
    }
}