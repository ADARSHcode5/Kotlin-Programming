fun main() {
    val employee = mutableMapOf(
        1 to "John",
        2 to "Alice"
    )

    println("Original Map: $employee")

    employee[3] = "Bob"
    employee[2] = "David"

    employee.remove(1)

    println("Updated Map:")

    for ((id, name) in employee) {
        println("$id -> $name")
    }
}