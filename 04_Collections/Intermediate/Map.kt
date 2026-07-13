fun main() {
    val students = mapOf(
        101 to "Adarsh",
        102 to "Rahul",
        103 to "Amit"
    )

    println("Student Details:")

    for ((roll, name) in students) {
        println("$roll -> $name")
    }

    println("Student with Roll 102: ${students[102]}")
    println("Contains Key 103: ${students.containsKey(103)}")
}