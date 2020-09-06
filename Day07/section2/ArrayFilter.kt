package Day07.section2

fun main() {
    val arr = arrayOf(1,-2,3,-5,5)
    arr.filter { e->e > 0 }.forEach{e -> print("$e")}
    println()

    val fruit = arrayOf("banana","avocado","apple","kiwi")
    fruit.filter { it.startsWith("a") }.forEach{e-> println("$e")}
    fruit.sortedBy {it}.forEach{e-> println("$e")}
    fruit.map { it.toUpperCase() }.forEach{e-> println("$e")}
    fruit.forEach { println(it)}

}