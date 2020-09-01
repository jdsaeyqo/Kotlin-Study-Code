package Day03.Condition

fun main() {

    print("점수 입력 : ")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F'


    if(score > 90) grade = 'A'
    else if(score > 80) grade= 'B' //score in 80..89
    else if(score > 70) grade= 'C'
    else if(score > 60) grade= 'D'
    else grade

    println(grade)





}