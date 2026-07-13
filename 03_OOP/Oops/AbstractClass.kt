abstract class Vehicle {
    abstract fun start()

    fun stop() {
        println("Vehicle Stopped")
    }
}

class Bike : Vehicle() {
    override fun start() {
        println("Bike Started")
    }
}

fun main() {
    val b = Bike()
    b.start()
    b.stop()
}