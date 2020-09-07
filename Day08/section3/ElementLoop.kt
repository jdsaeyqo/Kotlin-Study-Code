package Day08.section3

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A",300), Pair("B",200), Pair("C",100))
    val map  = mapOf(11 to "JAVA", 22 to "Kotlin", 33 to "C++")

    //forEach : 각 요소를 람다식으로 처리
    list.forEach{ println("$it")}
    println()
    list.forEachIndexed{idx, value -> println("idx[$idx] : $value") }
}