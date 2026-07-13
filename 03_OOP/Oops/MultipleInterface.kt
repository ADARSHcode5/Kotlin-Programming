interface A {
    fun show()
}

interface B {
    fun display()
}

class Demo : A, B {
    override fun show() {
        println("Show")
    }

    override fun display() {
        println("Display")
    }
}

fun main() {
    val d = Demo()
    d.show()
    d.display()
}