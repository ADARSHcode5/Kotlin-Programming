interface Animal1 {
    fun sound()
}

class Cat : Animal1 {
    override fun sound() {
        println("Meow")
    }
}

fun main() {
    Cat().sound()
}