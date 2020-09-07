package Day08.section3

fun main() {
    //불변
    val list1:List<String> = listOf("one","two","three")
    val list2:List<Int> = listOf(1,2,3)
    val list3  = list1 - "one"
    println(list3)
    // 연산자를 통해 새로운 리스트들을 출력할때 사용 가능
    println(list1 + "four")
    println(list2 + "Good")  //list2는 Int로 제한되있지만 +를 사용해 출력은 가능

    println(list2 - 1 )
    println(list1 - "one")

    println(list1 + listOf("a","b"))

    val map1 = mutableMapOf("hi" to 1, "hello" to 2, "Goodbye" to 3)
    map1.put("hey" , 4)
    println(map1)
    val map2 = map1+Pair("yo",5) + mapOf("good" to 6)
    println(map2)
    val map3 = map2 - listOf("hi","hello")
    println(map3)




}