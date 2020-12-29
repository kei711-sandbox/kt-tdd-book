package money

class Dollar(private val amount: Int) {
    fun times(multiplier: Int): Dollar = Dollar(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        val dollar = other as Dollar
        return amount == dollar.amount
    }
}
