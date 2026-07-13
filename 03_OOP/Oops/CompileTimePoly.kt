class MathOperation {

    fun add(a: Int, b: Int) = a + b

    fun add(a: Double, b: Double) = a + b
}

fun main() {
    val obj = MathOperation()
    println(obj.add(10, 20))
    println(obj.add(10.5, 20.5))
}