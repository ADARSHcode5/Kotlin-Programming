open class Shape {
    open fun draw() {
        println("Drawing Shape")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing Circle")
    }
}

fun main() {
    val s: Shape = Circle()
    s.draw()
}