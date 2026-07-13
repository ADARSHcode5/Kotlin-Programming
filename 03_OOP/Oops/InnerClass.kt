class Outer1 {
    private val message = "Hello Kotlin"

    inner class Inner {
        fun display() {
            println(message)
        }
    }
}

fun main() {
    val obj = Outer1().Inner()
    obj.display()
}