package Day03.Loop2

fun main() {
    val a = 6
    val b = 0
    val c : Int

    try {
        c= a/b
    }catch (e:Exception){
        println("Exception is handled")
    }finally {
        println("항상 실행되는 블록")
    }
}