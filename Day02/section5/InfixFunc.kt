package chap03.section5

infix fun Int.multiply(x : Int):Int {return  this*x}

fun main() {
    //3. 일반 표현법
    val multi1 = 3.multiply(10)

    //중위 표현법
    val multi = 3 multiply 10
    println("multi : $multi")

}