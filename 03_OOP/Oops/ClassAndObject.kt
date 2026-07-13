class Student1(val name: String, val age: Int) {
    fun display() {
        println("Name: $name")
        println("Age: $age")
    }
}

fun main() {
    val s1 = Student1("Adarsh", 21)
    s1.display()
}