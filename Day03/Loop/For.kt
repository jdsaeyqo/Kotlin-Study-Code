package Day03.Loop

fun main() {
    var sum = 0

    for (x in 1..10) {
        sum+=x

    }
    println(sum)


    for (i in 5 downTo 1) print("$i " )
    println()
    //for (i in 5 .. 1) print(i)  잘못된 사용. 아무것도 출력되지 않음.
    for (i in 1..5 step 2) print("$i ")
    println()
    for (i in 5 downTo 1 step 2)print("$i ")
}