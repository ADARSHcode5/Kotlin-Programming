/**
 * Higher-Order Function.
 * The third parameter 'operation' is a function signature that takes two Ints and returns an Int.
 */
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    // Execute the function passed via the parameter
    return operation(a, b)
}

fun main() {
    // Pass a lambda expression inside the parentheses
    val sum = calculate(10, 5, { x, y -> x + y })

    // Best Practice: If the lambda is the LAST argument,
    // you can pull it completely OUTSIDE the parentheses.
    val product = calculate(10, 5) { x, y ->
        x * y
    }

    println("Sum: $sum, Product: $product")
}