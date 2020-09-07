package Day08.section1

fun main() {
    //불변형 list 사용
    var num : List<Int> = listOf(1,2,3,4,5)
    var names : List<String> = listOf("one","two","three")

    for(name in names) println(name)


    for (n in num) println(n)
    println()

    var mixTape = listOf("Hello",1,2.445,'s')

    for (x in mixTape) println(x)

    //indices 활용
    for(idx in mixTape.indices){
        println("mixTape[$idx] = ${mixTape[idx]}")
    }

    //emptyList : 빈 리스트
    val emptyList : List<String> = emptyList<String>()
}