/**
 * Function with default values assigned to parameters.
 * This prevents the need to write 3 different versions of the same function.
 */
fun greetUser(name: String, greeting: String = "Hello", punctuation: String = "!") {
    println("$greeting, $name$punctuation")
}

fun main() {
    // 1. Uses all defaults: outputs "Hello, Alice!"
    greetUser("Alice")

    // 2. Uses a named argument to skip 'greeting' but change 'punctuation': outputs "Hello, Bob..."
    greetUser(name = "Bob", punctuation = "...")

    // 3. Changing arguments out of order using names: outputs "Welcome, Charlie!"
    greetUser(punctuation = "!", greeting = "Welcome", name = "Charlie")
}