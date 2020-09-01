package Day03.Condition

fun main() {

    var x = readLine()!!.toInt()

    when (x) {

        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 또는 x == 4")
        in 5..10 -> println("x는 5이상 10이하 입니다")
        !in 11..20 -> println("x는 11미만 20 초과 입니다")  // 위의 코드 실행되면 when 탈출하므로 죽은 코드.

        else -> println("입력 값이 어떤 범위에도 없습니다")
    }

    val str = "안녕하세요"
    val result =
        when (str) {
            is String -> println("문자열입니다")
            else -> false

        }
    print("점수 입력 : ")

    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    when(score){
        in 90.0 .. 100.00 -> grade='A'
        in 80.0 .. 89.99 -> grade='B'
        in 70.0 .. 79.99 -> grade='C'
        in 60.0 .. 69.99 -> grade='D'
        else -> grade='F'
    }
    println(grade)

    val nsg =
        when(score){
            90.0, 100.0 -> "Good"
            else -> "Not bad"
        }

}

