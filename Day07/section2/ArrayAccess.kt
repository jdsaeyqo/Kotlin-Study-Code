package Day07.section2

import java.util.*

fun main() {
    val arr = arrayOf(1,2,3,4,5)

    println(arr.get(2))
    println(arr[2])

    println(arr.size)

    for (ele in arr){
        println(ele)

    }

    println(Arrays.toString(arr))
    println(arr.sum())

    arr.set(1,8)

}