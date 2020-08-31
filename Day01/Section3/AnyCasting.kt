package chap02.Section3

fun main() {
    var a :Any = 1      //Any형 a는 1로 초기화될 때 Int형이 됨
    a = 20L         //Int형이었던 a 는 변경된 값 20L에 의해 Long이 됨
    println("a : $a  type : ${a.javaClass}")

}