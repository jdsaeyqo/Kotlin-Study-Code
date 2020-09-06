package Day07.section1


fun<T>add(a:T, b:T, op:(T,T)-> T):T{
    return op(a,b)
}

fun main() {
    val result = add(2,4,{a,b -> a+b})
    println(result)
    val result1 = add("Go","Stop",{a,b -> a+b})
    println(result1)

}