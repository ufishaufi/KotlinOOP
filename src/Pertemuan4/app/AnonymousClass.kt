package Pertemuan4.app

import Pertemuan4.data.Action

fun fireAction(action: Action) {
    action.action()
}

class sampleAction: Action {
    override fun action() {
        println("This is a simple action")
    }
}

fun main() {
    fireAction(sampleAction())

    fireAction(object: Action{
        override fun action() = println("Action One")
    })

    fireAction(object: Action{
        override fun action() = println("Action two")
    })
}