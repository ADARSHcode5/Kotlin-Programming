class Person {
    var name = ""
    var age = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun display() {
        println("$name $age")
    }
}

fun main() {
    val p = Person("Aman", 22)
    p.display()
}