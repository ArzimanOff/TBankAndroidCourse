package kotlinclasshomework.kotlinClass

sealed class PurchaseStatus {

    data object InProgress: PurchaseStatus()

    data object Ready: PurchaseStatus()

    data class Canceled(val reason: String): PurchaseStatus()
}