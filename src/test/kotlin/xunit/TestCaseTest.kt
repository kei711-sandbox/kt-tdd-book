package xunit

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TestCaseTest(name: String): TestCase(name) {
    var test: WasRun? = null;

    override fun setUp() {
        test = WasRun("testMethod")
    }

    fun testRunning() {
        test?.let {
            it.run()
            assertTrue(it.wasRun)
        } ?: assertTrue(false)
    }

    fun testSetUp() {
        test?.let {
            it.run()
            assertTrue(it.wasSetUp)
        } ?: assertTrue(false)
    }
}

internal class Test {
    @Test
    fun test() {
        TestCaseTest("testRunning").run()
        TestCaseTest("testSetUp").run()
    }
}