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

    fun testFailedResultFormatting() {
        val result = TestResult()
        result.testStarted()
        result.testFailed()
        assertEquals("1 run, 1 failed", result.summary())
    }
}

internal class Test {
    @Test
    fun test() {
        println(TestCaseTest("testTemplateMethod").run().summary())
        println(TestCaseTest("testResult").run().summary())
        println(TestCaseTest("testFailedResult").run().summary())
        println(TestCaseTest("testFailedResultFormatting").run().summary())
    }
}