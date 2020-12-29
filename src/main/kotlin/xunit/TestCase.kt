package xunit

open class TestCase(var name: String) {
    fun run() {
        val method = this::class.members.find { it.name == name }
        method?.call(this)
    }
}