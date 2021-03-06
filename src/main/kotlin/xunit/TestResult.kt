package xunit

class TestResult(var runCount: Int = 0, var errorCount: Int = 0) {
    fun testStarted() {
        runCount += 1
    }

    fun testFailed() {
        errorCount += 1
    }

    fun summary(): String {
        return "%d run, %d failed".format(runCount, errorCount)
    }
}
