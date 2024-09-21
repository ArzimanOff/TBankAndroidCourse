package kotlinclasshomework.kotlinClass

fun main() {
    val person = Person("Иван")
    val person2 = Person("Саша", "Мой сейф")

    println("У $person депозитов: ${person.accounts.size}")
    println("У $person2 депозитов: ${person2.accounts.size}, : ${person2.accounts.first().name} - ${person2.accounts.first().bankAccountName}")
}

