/**
 * Head Recursion Example: Printing a series in ascending order.
 * The printing happens AFTER the recursive call finishes tracking down.
 */
fun headRecursionPrint(n: Int) {
    // Base Case
    if (n <= 0) return

    // Head Recursive Call: Made before processing the current 'n'
    headRecursionPrint(n - 1)

    // Process: This line waits on the stack and executes on the way back up
    println(n)
}

fun main() {
    println("--- Head Recursion ---")
    headRecursionPrint(3)
    // Output: 1, 2, 3 (Printed in reverse order of the calls because it waits on the stack)
}