package Day05.GetterSetter

open class First{
    open val x =0           //open 이므로 오버라이딩 가능
    get(){
        println("First x")
        return field
    }
    val y= 0                //open키워드 없으므로 final 프로퍼티, 오버라이딩 불가
}

class Second : First(){
    override val x: Int = 0
        get() {
            println("Second x")
            return field+3
        }
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}