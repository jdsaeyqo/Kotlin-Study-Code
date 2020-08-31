package chap03.section5

fun main() {

    //익명 함수

    val add : (Int, Int)-> Int = fun(a,b)=a+b
    val add1= fun(x:Int, y:Int)=x+y
    val add2 = {x:Int,y:Int -> x+y}     //람다식과 매우 흡사


    val result = add(10,2)
    println(result)
}




