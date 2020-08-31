package chap03.section5

fun main() {

    //인라인 함수 shortFun의 내용이 복사되어 들어감
    shortFun(3){ println("First call : $it")}
    shortFun(5){ println("Second call : $it")}

    shortFunc(3 ){
        println("First call : $it")
        return
    }

}

inline fun shortFun(a:Int,out: (Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After callint out()")}
//성능상의 이유로 인라인 함수는 일반함수에도 사용할 수 있으나 람다식을 매개 변수로
//가진 함수에 사용할 것을 추천하고 있습니다.

//코드가 복사되므로 내용이 많은 함수에 사용하면 코드가 늘어남


inline fun shortFunc(a:Int, out: (Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After callint out()")

}