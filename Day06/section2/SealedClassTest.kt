package Day06.section2

//실드 클래스 선언 방법 첫번째
sealed class Result{
    open class Success(val message : String):Result()
    class Error(val code:Int, val message: String):Result()
}

class Status : Result()     //실드 클래스 상속은 같은 파일에서만 가능
class Inside : Result.Success("Status")

//실드 클래스 선언 방법 두번째
sealed class Result1

open class Success1(val message: String):Result1()
class Error1(val code:Int, val message: String):Result1()

class Status1 : Result1()
class Inside1 : Success1("Status")

fun eval(result: Result):String = when(result){
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> "${result.code}번 ${result.message}"
    //모든 조건을 가지므로 else 필요 없음
}

fun main() {
    //Success객체 생성
    val result = Result.Error(11245,"Error!!")
    val msg = eval(result)
    println(msg)
}