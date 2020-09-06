package Day07.section2

import java.util.*

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 4, 5)

    //첫번째와 마지막 요소 확인
    println(arr1.first())
    println(arr1.last())

    //요소 3의 인덱스 출력
    println(arr1.indexOf(3))

    //배열의 평균값 출력
    println(arr1.average())

    //count에 의한 요소 개수
    println(arr1.count())

    //존재 여부 확인
    println(arr1.contains(5))
    println(5 in arr1)

    arr1.forEach { ele -> println("$ele") }
    arr1.forEachIndexed({ i, e -> println("arr1[$i] = $e") })

    val iter: Iterator<Int> = arr1.iterator()
    while (iter.hasNext()) {
        val e = iter.next()
        println("$e")
    }
    //오름차순
    val arr2 = intArrayOf(4, 8, 9, 2, 3)
    arr2.sort(1,4)
    println(Arrays.toString(arr2))

    //내림차순
    val arr3 = intArrayOf(4, 8, 9, 2, 3)
    arr3.sortDescending()
    println(Arrays.toString(arr3))

    val listSorted : List<Int> = arr3.sorted()

    val items = arrayOf<String>("dog","Cat","Lion","Kangaroo","Po")

    items.sort()
//    items.sortBy { item -> item.length }
    println(Arrays.toString(items))

}