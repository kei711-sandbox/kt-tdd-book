package xunit

open class TestCase(var name: String) {
    open fun setUp() {}
    open fun tearDown() {}

    fun run() {
        setUp()
        val method = this::class.members.find { it.name == name }
        method?.call(this)
        tearDown()
    }
}