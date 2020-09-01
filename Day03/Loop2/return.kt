package Day03.Loop2

fun add(a:Int,b:Int):Int{
    return a+b
    println("이 코드는 실행되지 않습니다.")
}

fun hello(name: String){
    println(name)
}

inline fun inlineLambda(a:Int, b:Int,out:(Int,Int)-> Unit){
    out(a,b)
}

fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3)/*@lit*/{a,b -> val result = a+b  // 람다식 시작 부분에 라벨을 지정함(생략시엔 뒤에 @함수이름)
    if (result > 10) return@inlineLambda //return과 라벨을 같이 쓰면 라벨처리한 부분만 빠져나감
    println("result: $result")
    }
    println("end of retFunc")

}

fun main() {
    hello("Lee Sang wook")

    retFunc()

}