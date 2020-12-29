package xunit

class TestResult(var runCount: Int = 0) {
    fun testStarted() {
        runCount += 1
    }
    fun summary(): String {
        return "%d run, 0 failed".format(runCount)
    }
}
