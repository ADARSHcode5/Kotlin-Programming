fun main() {
    val age = 20
    val citizen = true

    if (age >= 18) {
        if (citizen) {
            println("Eligible to vote")
        } else {
            println("Not a citizen")
        }
    } else {
        println("Underage")
    }
}