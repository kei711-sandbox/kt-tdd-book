package money

abstract class Money(protected val amount: Int, protected val currency: String) {
    abstract fun times(multiplier: Int): Money
    fun currency(): String = currency

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && javaClass.equals(money.javaClass)
    }

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount, "USD")
        fun franc(amount: Int): Franc = Franc(amount, "CHF")
    }
}