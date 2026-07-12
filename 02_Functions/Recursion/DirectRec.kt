/**
 * Direct Recursion Example: Printing a countdown.
 * The function directly calls 'countDown' inside 'countDown'.
 */
fun countDown(n: Int) {
    // Base Case: Stop when n reaches 0
    if (n <= 0) {
        println("Liftoff!")
        return
    }

    // Process: Print the current number
    println(n)

    // Recursive Call: Direct call to itself with a smaller input
    countDown(n - 1)
}

fun main() {
    println("--- Direct Recursion ---")
    countDown(3)
    // Output: 3, 2, 1, Liftoff!
}