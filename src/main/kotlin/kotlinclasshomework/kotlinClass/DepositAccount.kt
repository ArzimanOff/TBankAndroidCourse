package kotlinclasshomework.kotlinClass

import kotlinclasshomework.abstractClass.BankAccount

class DepositAccount(var name: String = "Deposit"): BankAccount(){
    private var availableFunds: Double = 500_000.0

    override fun getAvailableFund(): Double{
        return availableFunds
    }


    override fun withdrawMoney(amount: Double): Double{
        return if (amount > 0 && amount <= availableFunds) {
            availableFunds -= amount
            amount
        } else {
            0.0
        }
    }

    override fun depositMoney(amount: Double){
        if (amount > 0){
            availableFunds += amount
            println("На счёт $name была успешно внесена сумма: $amount")
        } else{
            println("Невозможно внести такую сумму")
        }
    }

    fun changeDepositName(newName: String){
        name = newName
        println("Имя успешно было сменено на: $name")
    }
}