package money

open class Money(val amount: Int, val currency: String) : Expression {
    override fun times(multiplier: Int): Expression = Money(amount * multiplier, currency)

    override fun plus(addend: Expression): Expression = Sum(this, addend)

    override fun reduce(bank: Bank, to: String): Money {
        val rate: Int = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

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