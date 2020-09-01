package Day03.Loop

fun main() {

    print("정수 입력 : ")
    var num = readLine()!!.toInt()
    var fac = 1

    while(num > 0){
        fac *=num
        num--
    }
    println(fac)
}