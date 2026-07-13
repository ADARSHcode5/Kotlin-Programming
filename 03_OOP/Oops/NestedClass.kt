class Outer {

    class Inner {
        fun show() {
            println("Nested Class")
        }
    }
}

fun main() {
    Outer.Inner().show()
}