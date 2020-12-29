package xunit

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestCaseTest(name: String): TestCase(name) {
    fun testRunning() {
        val test = WasRun("testMethod")
        assertFalse(test.wasRun)
        test.run()
        assertTrue(test.wasRun)
    }

}

internal class Test {
    @Test
    fun test() {
        TestCaseTest("testRunning").run()
    }
}