package xunit

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCaseTest(name: String) : TestCase(name) {
    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        test.run()
        assertEquals("setUp testMethod tearDown ", test.log)
    }
}

internal class Test {
    @Test
    fun test() {
        TestCaseTest("testTemplateMethod").run()
    }
}