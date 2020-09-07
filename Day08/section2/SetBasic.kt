package Day08.section2

fun main() {
    //불변형 Set
    val mixedTypeSet  = setOf("Hello",5,"world",3.14,'c')

    var intset : Set<Int> = setOf<Int>(1,5,5) //중복된건 하나만


    println(mixedTypeSet)
    println(intset)

    //가변형 Set 정의
    val animals = mutableSetOf("Lion","Dog","Cat","Python","Hippo")
    println(animals)

    //요소 추가
    animals.add("Dog")  //이미 존재하므로 변화없음
    println(animals)

    //요소 삭제
    animals.remove("Python")
    println(animals)
}