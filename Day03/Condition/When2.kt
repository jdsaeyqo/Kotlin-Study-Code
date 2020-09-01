package Day03.Condition

class MyClass


fun main() {
    print("점수 입력 : ")

    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    when{
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score in 60.0..69.9 -> grade = 'D'
        else -> grade = 'F'
    }
    println(grade)

    cases(1)
    cases("Hello")
    cases(System.currentTimeMillis())
    cases(MyClass())

}

fun cases(obj:Any){
    when(obj){
        1 -> println("Int : $obj")
        "Hello"-> println("String : $obj")
        is Long -> println("Long : $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}