package Day07.section2

import java.util.*

fun main() {

    val arr = intArrayOf(1,2,3,4,5)

    println("arr : ${Arrays.toString(arr)}")

    println("size : ${arr.size}")
    println("sum : ${arr.sum()}")

    println(arr.get(2))

    for (i in 0..arr.size -1)
        println("arr[$i] = ${arr[i]}")


}