package xunit

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCaseTest(name: String) : TestCase(name) {
    var result: TestResult = TestResult()

    override fun setUp() {
        result = TestResult()
    }

    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        test.run(result)
        assertEquals("setUp testMethod tearDown ", test.log)
    }

    fun testResult() {
        val test = WasRun("testMethod")
        test.run(result)
        assertEquals("1 run, 0 failed", result.summary())
    }

    fun testFailedResult() {
        val test = WasRun("testBrokenMethod")
        test.run(result)
        assertEquals("1 run, 1 failed", result.summary())
    }

    fun testFailedResultFormatting() {
        result.testStarted()
        result.testFailed()
        assertEquals("1 run, 1 failed", result.summary())
    }

    fun testSuite() {
        val suite = TestSuite()
        suite.add(WasRun("testMethod"))
        suite.add(WasRun("testBrokenMethod"))
        suite.run(result)
        assertEquals("2 run, 1 failed", result.summary())
    }
}

internal class Test {
    @Test
    fun test() {
        val suite = TestSuite()
        suite.add(WasRun("testTemplateMethod"))
        suite.add(WasRun("testResult"))
        suite.add(WasRun("testFailedResult"))
        suite.add(WasRun("testFailedResultFormatting"))
        suite.add(WasRun("testSuite"))
        val result = TestResult()
        suite.run(result)
        println(result.summary())
    }
}