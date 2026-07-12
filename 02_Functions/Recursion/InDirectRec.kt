/**
 * Indirect Recursion Example: Checking if a number is Even or Odd.
 * 'isEven' calls 'isOdd', and 'isOdd' calls 'isEven'.
 */

fun isEven(n: Int): Boolean {
    // Base Case
    if (n == 0) return true

    // Indirect Recursive Call: Calls isOdd
    return isOdd(n - 1)
}

fun isOdd(n: Int): Boolean {
    // Base Case
    if (n == 0) return false

    // Indirect Recursive Call: Calls isEven
    return isEven(n - 1)
}

fun main() {
    println("--- Indirect Recursion ---")
    val num = 4
    println("Is $num even? ${isEven(num)}") // Output: true
}