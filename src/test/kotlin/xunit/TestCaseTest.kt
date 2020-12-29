package xunit

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCaseTest(name: String) : TestCase(name) {
    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        test.run()
        assertEquals("setUp testMethod tearDown ", test.log)
    }

    fun testResult() {
        val test = WasRun("testMethod")
        val result = test.run()
        assertEquals("1 run, 0 failed", result.summary())
    }

    fun testFailedResult() {
        val test = WasRun("testBrokenMethod")
        val result = test.run()
        assertEquals("1 run, 1 failed", result.summary())
    }
}

internal class Test {
    @Test
    fun test() {
        TestCaseTest("testTemplateMethod").run()
        TestCaseTest("testResult").run()
//        TestCaseTest("testFailedResult").run()
    }
}