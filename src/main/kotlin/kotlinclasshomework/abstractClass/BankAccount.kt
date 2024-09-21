package kotlinclasshomework.abstractClass

abstract class BankAccount {
    val bankAccountName = "Tinkoff"
    abstract fun getAvailableFund(): Double
    abstract fun withdrawMoney(amount: Double): Double
    abstract fun depositMoney(amount: Double)
    fun getInfo(){
        println("Счёт банка $bankAccountName")
    }
}