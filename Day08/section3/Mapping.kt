package Day08.section3

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listwithNull = listOf(1,null,3,null,5)

    //map : 컬렉션에 주어진 식을 적용해 새로운 컬렉션을 반환
    println(list.map { it*2 })  //[2,4,6,8,10,12]

    //mapIndexed : 컬렉션에 인덱스를 포함해 주어진 식을 적용해 새로운 컬렉션 반환
    val mapIndexed = list.mapIndexed{index, it -> index * it }
    println(mapIndexed) //[0,2,6,12,20,30]

    //mapNotNull : null을 제외하고  식을 적용해 새로운 컬렉션 반환
    println(listwithNull.mapNotNull { it?.times(2) })//[2,6,10,12]
}