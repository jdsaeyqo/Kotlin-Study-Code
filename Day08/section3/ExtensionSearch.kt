package Day08.section3

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A",300), Pair("B",200), Pair("C",100), Pair("D",200))
    val listRepeated = listOf(2,2,3,4,5,5,6)

    //elementAt : 인덱스에 해당하는 요소를 반환
    println(list.elementAt(1))

    //elementAtOrElse : 인덱스를 벗어나는 경우 식에 따라 결과 반한 아니면 요소 반환
    println(list.elementAtOrElse(10,{2 * it}))

    //elementAtOrNull : 인덱스를 벗어나는 경우 null반환
    println(list.elementAtOrNull(10))
}