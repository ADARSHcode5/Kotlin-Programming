/**
 * Tail Recursion Example: Calculating factorial.
 * The recursive call is the final statement, passing the running total into an 'accumulator'.
 */
tailrec fun tailFactorial(n: Int, accumulator: Int = 1): Int {
    // Base Case
    if (n <= 1) return accumulator

    // Tail Recursive Call: The call is the absolute last thing executed.
    // Notice we multiply BEFORE passing the result, so no work is left after the call.
    return tailFactorial(n - 1, n * accumulator)
}

fun main() {
    println("--- Tail Recursion ---")
    // 5! = 5 * 4 * 3 * 2 * 1 = 120
    println("Factorial of 5: ${tailFactorial(5)}")
}