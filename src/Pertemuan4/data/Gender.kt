package Pertemuan4.data

enum class Gender(val desc: String){
    MALE("Male"),
    FEMALE("Female");

    fun showDesc() {
        println(desc)
    }
}