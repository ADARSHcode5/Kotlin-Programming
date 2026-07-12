/**
 * An extension function on the built-in String class.
 * Inside the function, 'this' refers to the actual string instance it is called on.
 */
fun String.isValidEmail(): Boolean {
    // 'this' refers to the string value being checked
    return this.contains("@") && this.contains(".")
}

fun main() {
    val email = "developer@kotlin.org"

    // Call it naturally as if it were a native method of the String class
    if (email.isValidEmail()) {
        println("Valid email address!")
    }
}