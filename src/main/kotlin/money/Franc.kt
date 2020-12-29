package money

class Franc(private val amount: Int) {
    fun times(multiplier: Int): Franc = Franc(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        val dollar = other as Franc
        return amount == dollar.amount
    }
}
