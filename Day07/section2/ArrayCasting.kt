package Day07.section2

import java.util.*

fun main() {
    val b = Array<Any>(10,{0})
    b[0]= "good"
    b[1]= 3.4

    println(Arrays.toString(b))

    val arr = arrayOf(4,5,2,6,7,9)

    val L1 : List<Int> = arr.sorted()
    val L2 : List<Int> = arr.sortedDescending()
    println(L1)
    println(L2)
}