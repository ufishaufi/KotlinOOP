package Pertemuan3.app

import Pertemuan3.data.BigNote
import Pertemuan3.data.Note

fun main(args: Array<String>) {
    val note = Note("Belajar Kotlin")

    println(note.title) //access getter

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Golang")
    println(bigNote.title)
    println(bigNote.BigTitle)

}