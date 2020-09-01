package Day03.Loop

fun main() {

    var total : Int =0

    for (i in 1..100 step 2) total +=i
    println("Odd sum : $total")

    for (i in 2..100 step 2) total +=i
    println("Even sum : $total")

}