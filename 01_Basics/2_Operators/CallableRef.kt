fun greet() {
    println("Hello Kotlin")
}

fun main() {
    val ref = ::greet
    ref()
}