package chap03.section2



fun main() {
    println(highFun({x,y -> x + y}, 10, 20))


    var result : Int

    val multi = {x : Int,y : Int -> x*y}
    result = multi(10,20)
    println(result)

}
fun highFun(sum:(Int,Int) -> Int ,a: Int, b:Int) : Int = sum(a,b)


