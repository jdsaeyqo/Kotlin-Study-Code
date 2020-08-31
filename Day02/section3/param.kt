package chap03.section3

fun main() {

    // 1. 인자와 반환값이 있는 함수
    val res1= funcParam(3,2, ::tot)
    println(res1)

    // 2. 인자가 없는 함수
    hello(::text)

    // 3. 일반 변수에 값처럼 할당
    val likeLamda = ::tot
    println(likeLamda(6,6))

}

fun tot(a :Int,b:Int) = a+b

fun text(a:String, b:String) = "Hi! $a $b"

fun funcParam(a:Int,b:Int, c:(Int,Int)->Int):Int {
    return c(a,b)
}

fun hello(body:(String, String)-> String):Unit{
    println(body("Hello","World"))
}