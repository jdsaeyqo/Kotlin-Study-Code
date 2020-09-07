package Day08.section1

import java.util.*


fun main() {
    //가변형 List를 생성하고 자바의 ArrayList로 반환
    val stringList : ArrayList<String> = arrayListOf<String>("Hello","Kotlin","Wow")
    stringList.add("JAVA")
    stringList.remove("Hello")
    stringList[0] = "HI"
    println(stringList)

    val names: List<String> = listOf("one","two","three")   //불변형 리스트

    val mutableNames = names.toMutableList()    //새로운 가변형 List가 만들어짐
    mutableNames.add("four")
    println(mutableNames)
}