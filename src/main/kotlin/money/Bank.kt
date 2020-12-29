package money

class Bank {
    private var rates: MutableMap<Pair, Int> = mutableMapOf()

    fun reduce(source: Expression, to: String): Money = source.reduce(this, to)

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        if (from.equals(to)) return 1
        return rates[Pair(from, to)] ?: 1
    }
}
