package Day06.section3

class point(var x : Int = 0, var y : Int=10){
    //plus 함수의 연산자 오버로딩
    operator fun plus(p:point):point{
        return point(x+p.x,y+p.y)
    }
}

fun main() {
    val p1 = point(3,-8)
    val p2 = point(2,9)

    var point = point()
    point = p1 + p2
    println("point = (${point.x}, ${point.y}")
}