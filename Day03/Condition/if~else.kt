package Day03.Condition

fun main() {
    var a:Int=3
    var b:Int=56

    val max =
        if (a > b){
        print("a 선택 : ")
        a       //마지막 식인 a가 반환되어 max에 할당
    }
        else {
            print("b선택 : ")
            b
        }
    println(max)

}