package Day08.section1

//get(Index : Int) : 특정 인덱스를 인자로 받아 해당 요소 반환

//indexOf(element : E) : 인자로 받은 요소가 첫 번째로 나타나는 인덱스를 반환하며, 없으면 -1을 반환

//lastIndexOf(element : E) : 인자로 받은 요소가 마지막으로 나타나는 인덱스를 반환하고, 없으면 -1을 반환

//listIterator() : 목록에 있는 iterator를 반환

//subList(fromIndex : Int, toIndex : Int) : 특정 인덱스의 from과 to 범위에 있는 요소 목록 반환

fun main() {
    var num = listOf<Int>(1,2,3,4,5)

    println(num.size)
    println(num.indexOf(4))
    println(num.get(2))
    println(num[4])
    println(num.contains(2))
}