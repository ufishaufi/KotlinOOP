package Pertemuan5.data

data class Fruit(val quantity: Int) {

    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(this.quantity - fruit.quantity)
    }

    operator fun times(fruit: Fruit): Fruit {
        return Fruit(this.quantity * fruit.quantity)
    }

    operator fun div(fruit: Fruit): Fruit {
        return Fruit(this.quantity / fruit.quantity)
    }

    operator fun rem(fruit: Fruit): Fruit {
        return Fruit(this.quantity % fruit.quantity)
    }

//    operator fun rangeTo(fruit: Fruit): Fruit {
//        return Fruit(this, fruit)
//    }
}