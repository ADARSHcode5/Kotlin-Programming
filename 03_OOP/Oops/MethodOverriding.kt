open class Animal {
    open fun sound() {
        println("Animal Sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Dog Barks")
    }
}

fun main() {
    Dog().sound()
}