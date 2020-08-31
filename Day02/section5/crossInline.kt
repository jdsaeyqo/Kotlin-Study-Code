package chap03.section5

fun main() {

    shortfun(3){ println("First call : $it")}

}

inline fun shortfun(a:Int, crossinline out:(Int)->Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

fun nestedFunc(body:()-> Unit){
    body()
}