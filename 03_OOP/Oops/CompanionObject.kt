class Calculator {

    companion object {
        fun square(x: Int) = x * x
    }
}

fun main() {
    println(Calculator.square(5))
}