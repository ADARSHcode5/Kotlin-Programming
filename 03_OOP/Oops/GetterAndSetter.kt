

class Student {
    var marks = 0
        set(value) {
            if (value >= 0)
                field = value
        }

        get() = field
}

fun main() {
    val s = Student()
    s.marks = 95
    println(s.marks)
}