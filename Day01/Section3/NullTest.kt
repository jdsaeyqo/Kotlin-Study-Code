package chap02.Section3

fun main() {
    var str1 : String?="Hello Kotlin"   //자료형에 ? 붙이면 null허용
    var num : Int? = 10

    num = null

//   str1 = null //기본적으로는 null을 허용하지 않음. 오류발생
    println("str 1 : $str1")

    val len = if (str1 != null) str1.length else -1
    println("str1 : $str1 length : ${len}")


    println("str1 : $str1 length : ${str1?.length ?:-1}")



}