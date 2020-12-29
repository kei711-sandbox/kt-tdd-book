package xunit

class TestSuite {
    private var tests: MutableList<TestCase> = mutableListOf()

    fun add(test: TestCase) {
        tests.add(test)
    }

    fun run(result: TestResult) {
        for (test in tests) {
            test.run(result)
        }
    }
}
