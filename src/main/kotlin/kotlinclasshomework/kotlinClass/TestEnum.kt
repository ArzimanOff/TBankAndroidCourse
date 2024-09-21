package kotlinclasshomework.kotlinClass

/**
 * У нас есть метод getPurchaseStatus(), но сейчас Android Studio ругается на ошибку. Исправьте ее и запустите программу.
 * Что будет выведено в терминале?
 * Помните, что задачу можно решить несколькими способами.
 */
fun main() {
    getPurchaseStatus(PurchaseStatus.InProgress)
    getPurchaseStatus(PurchaseStatus.Ready)
    getPurchaseStatus(PurchaseStatus.Canceled("Высокая цена"))
}

fun getPurchaseStatus(status: PurchaseStatus) = when (status) {
    PurchaseStatus.InProgress -> println("доставка в процессе")
    PurchaseStatus.Ready -> println("доставка готова")
    is PurchaseStatus.Canceled -> {
        println("Доставка отменена, причина: ${status.reason}")
    }
}