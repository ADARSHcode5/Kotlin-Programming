class Car(val brand: String) {
    init {
        println("Car Created: $brand")
    }
}

fun main() {
    Car("Toyota")
}