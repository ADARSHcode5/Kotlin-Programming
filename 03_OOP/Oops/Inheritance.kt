open class Animal2 {
    fun eat() {
        println("Animal is eating")
    }
}

class Dog1 : Animal2()

fun main() {
    val d = Dog1()
    d.eat()
}