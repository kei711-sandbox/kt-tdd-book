package money

class Dollar(amount: Int): Money(amount) {
    fun times(multiplier: Int): Dollar = Dollar(amount * multiplier)
}
