package Pertemuan3.data

open class Teacher(internal val name: String) {
    private fun teach() {
        println("Teach!")
    }

    open protected fun test() {
        println("Test")
    }
}

class SuperTeacher(name: String) : Teacher(name) {

    public override fun test() {
        super.test()
    }
}
