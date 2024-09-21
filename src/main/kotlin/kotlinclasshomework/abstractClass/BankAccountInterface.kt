package kotlinclasshomework.abstractClass

interface BankAccountInterface {
    val bankAccountName: String
    fun getAvailableFund(): Double
    fun withdrawMoney(amount: Double): Double
    fun depositMoney(amount: Double)
    fun getInfo(){
        println("Счёт банка $bankAccountName")
    }
}