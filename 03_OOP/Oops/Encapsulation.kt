class BankAccount {
    private var balance = 1000

    fun deposit(amount: Int) {
        balance += amount
    }

    fun getBalance() = balance
}

fun main() {
    val acc = BankAccount()
    acc.deposit(500)
    println(acc.getBalance())
}