package Day08.section2

//Map
// 키와 값으로 구성된 요소 저장
// 키는 중복될 수 없지만 값은 중복 저장 가능

fun main() {
    //불변형
    val langMap : Map<Int,String> = mapOf(11 to "Java", 22 to "Kotlin",33 to "C++")
    for ((key,value) in langMap){
        println("ket = $key, value = $value")
    }

    println("langMap[22] = ${langMap[22]} ")
    println("langMap.get(22) = ${langMap.get(22)} ")
    println("langMap.keys = ${langMap.keys} ")
}