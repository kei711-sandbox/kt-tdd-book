package money

abstract class Money(protected val amount: Int) {
    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && javaClass.equals(money.javaClass)
    }

    companion object {
        @JvmStatic
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }
        @JvmStatic
        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }
}