package xunit

class WasRun(name: String) : TestCase(name) {
    var log = ""

    override fun setUp() {
        log = "setUp "
    }

    fun testMethod() {
        log += "testMethod "
    }

    override fun tearDown() {
        log += "tearDown "
    }
}