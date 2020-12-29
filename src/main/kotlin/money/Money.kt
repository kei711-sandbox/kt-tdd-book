package money

open class Money(protected val amount: Int, protected val currency: String): Expression {
    fun times(multiplier: Int): Money = Money(amount * multiplier, currency)

    fun plus(added: Money): Expression = Money(amount + added.amount, currency)

    fun currency(): String = currency

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && currency().equals(money.currency())
    }

    override fun toString(): String = "$amount $currency"

    companion object {
        fun dollar(amount: Int) = Money(amount, "USD")
        fun franc(amount: Int) = Money(amount, "CHF")
    }
}