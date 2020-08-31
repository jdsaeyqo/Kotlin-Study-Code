package chap03.section3

fun  highOrder ( sum:(Int,Int)->Int, a:Int, b:Int) :Int{
    return sum(a,b)
}

fun main() {

    val result : Int

    result = highOrder({a,b -> a+b},10,20)
  println(result)

    fun sum2(x:Int, y:Int)= x-y
    val result3= sum2(35,56)
    val sum= {x:Int, y:Int -> x*x+y}
    var result1 = sum(4,6)
    println(result1)


}

fun sum1(a:Int, b:Int) = a+b

