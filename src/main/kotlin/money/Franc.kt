package money

class Franc(amount: Int, currency: String): Money(amount, currency) {
    override fun times(multiplier: Int): Money = franc(amount * multiplier)
}
