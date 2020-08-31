package chap03.section5

infix fun String.getLongString(target: String):String = if(this.length > target.length) this else target

fun main() {
    val source = "Hello Kotlin"
    val target = "World"
    println(source.getLongString(target))

    val long = "nadf" getLongString "dddddd"
    println(long)
}