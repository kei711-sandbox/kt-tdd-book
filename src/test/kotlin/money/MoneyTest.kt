package money

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class MoneyTest {
    @Test
    internal fun testMultiplication() {
        val five: Money = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    internal fun testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)))
        assertFalse(Money.dollar(5).equals(Money.dollar(6)))
        assertFalse(Money.franc(5).equals(Money.dollar(5)))
    }

    @Test
    internal fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }
}