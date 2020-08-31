package chap03.section3

fun main() {

    val result :Int

    val multi = {x:Int, y: Int ->
        println("x * y = ")
        println(x+y)
        x * y}

    result = multi(10,20)
    println(result)

    val greet:() -> Unit = { println("Hello") }
    val nest : () -> () -> Unit = {{ println("Hello")}}

    println(greet)
    greet()

    nest()()
}