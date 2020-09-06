package Day07.section2

import java.util.*
import kotlin.Comparator

data class Product(val name:String, val price : Double)

fun main() {
    val products = arrayOf(
        Product("A",870.00),
        Product("B",999.00),
        Product("C",564.00),
        Product("D",257.00),
        Product("E",7932.00),
        Product("F",123.00),
        Product("G",876.00)
    )

//    products.sortByDescending { it.price }  //내림차순 정렬
//    products.forEach { println(it) }

    products.sortWith(
        Comparator<Product>{p1,p2 ->
            when{
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )

    products.forEach { println(it) }
    println()

    //compareBy를 함께 사용해 두개의 정보 정렬
    //두개 이상 사용 가능
    products.sortWith(compareBy({it.price},{it.name}))
                                //앞의 인자가 sort되면서 뒤에 인자 정보나타냄
    products.forEach { println(it) }
    println()

    //지정된 필드의 가장 작은/큰 값 골라내기
    println(products.minBy { it.price })
    println(products.maxBy { it.price })
    println(products.minBy { it.name })
    println(products.maxBy { it.name })
}