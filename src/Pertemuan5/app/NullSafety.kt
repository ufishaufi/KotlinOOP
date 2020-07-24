package Pertemuan5.app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//  Checking for Null
//  if (friend != null) {
//       println("Hello ${friend.name}")

//  elvis operator
  val name = friend?.name ?: "Friend"
  println("Hello $name")

//  operator !!
//    val name = friend!!.name
//    println("Hello $name")
//    }
}

fun main() {
    sayHello(Friend("Shaufi"))
    sayHello(null)
}