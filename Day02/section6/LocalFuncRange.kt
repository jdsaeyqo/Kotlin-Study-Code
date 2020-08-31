package chap03.section6

fun a() = b()           //최상위 함수이므로 b()함수 선언 위치 관계없이 사용 가능
fun b()= println("b")

fun c() {
    fun d(){} //e()       //오류 지역함수이므로 e()가 먼저 불려야 사용 가능
    fun e() = println("e")
}

fun main() {

    a()     //최상위 함수이므로 사용가능
//    d(),e()  사용 불가

}