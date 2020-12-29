package money

class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar = Dollar(amount * multiplier)
}
