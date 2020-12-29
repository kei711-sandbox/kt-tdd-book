package xunit

open class TestCase(var name: String) {
    open fun setUp() {}
    open fun tearDown() {}

    fun run(): TestResult {
        val result = TestResult()
        result.testStarted()
        setUp()
        try {
            val method = this::class.members.find { it.name == name }
            method?.call(this)
        } catch (e: Exception) {
            result.testFailed()
        }
        tearDown()
        return result
    }
}