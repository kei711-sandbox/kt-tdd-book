package money

class Franc(amount: Int): Money(amount) {
    override fun times(multiplier: Int): Money = Franc(amount * multiplier)
}
