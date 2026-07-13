class Employee(val id: Int, val name: String)

fun main() {
    val emp = Employee(101, "Rahul")
    println("${emp.id} ${emp.name}")
}