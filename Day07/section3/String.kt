package Day07.section3

import java.lang.StringBuilder

fun main() {
    //해당 인덱스 범위의 값 반환
    var s : String = "  ab cd efg  "
    var s0 = s.split(" ")
    var s00 = s.trim()
    println(s00)

    println(s0)
    println(s[0])
    println(s.substring(0..2))

    s = s.substring(0..1) + "x"+ s.substring(3..s.length-1)
    println(s)

    var s1 = "Hello Kotlin"
    var s2 = "Hello KOTLIN"
    //같으면 0, s1 < s2 이면 양수, 반대면 음수 반환
    println(s1.compareTo(s2))                       //양수
    println(s1.compareTo(s2,true))      //대소문자 무시하고 비교 같으므로 0

    //StringBuilder  문자열이 자주 변경되는 경우 사용
    var s3 = StringBuilder("Hello")
    s3[2] = 'x'
    println(s3)

    s3.append("World")
    s3.insert(10,"Added")
    s3.delete(5,10)
    println(s3)

    //toLowerCase(), toUpperCase()

    //특정 문자단위로 잘라내기
    var deli = "Welcome to Kotlin"
    val sp = deli.split(" ")
    println(sp)

}