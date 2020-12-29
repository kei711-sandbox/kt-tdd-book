package money

open class Money(protected val amount: Int, protected val currency: String) {
    fun times(multiplier: Int): Money = Money(amount * multiplier, currency)

    fun currency(): String = currency

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && currency().equals(money.currency())
    }

    override fun toString(): String = "$amount $currency"

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount, "USD")
        fun franc(amount: Int): Franc = Franc(amount, "CHF")
    }
}