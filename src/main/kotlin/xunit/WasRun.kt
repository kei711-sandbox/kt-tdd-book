package xunit

class WasRun(name: String): TestCase(name) {
    var wasSetUp = false
    var wasRun = false

    override fun setUp() {
        wasRun = false
        wasSetUp = true
    }

    fun testMethod() {
        wasRun = true
    }
}