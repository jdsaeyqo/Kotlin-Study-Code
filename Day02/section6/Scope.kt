package chap03.section6

fun userFunc(counts :Int){      //사용자가 만든 최상위 레벨의 함수 선언

}

fun main() {        //최상위 레벨의 함수

    fun secondFunc(a:Int){}         //지역 함수 선언

    userFunc(4)//       사용자 함수 사용  - 선언부의 위치와 관계 없이 사용
    secondFunc(2 ) //        지역함수 사용     - 선언부가 먼저 나와야 사용 가능

}