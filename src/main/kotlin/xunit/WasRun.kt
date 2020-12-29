package xunit

class WasRun(name: String) : TestCase(name) {
    var log = ""

    override fun setUp() {
        log = "setUp "
    }

    fun testMethod() {
        log += "testMethod "
    }

    fun testBrokenMethod() {
        throw Exception()
    }

    override fun tearDown() {
        log += "tearDown "
    }
}