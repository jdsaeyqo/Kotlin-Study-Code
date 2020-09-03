package Day05.lateInit

class LazyTest{
    init {
        println("init block")       //2

    }
    val subject by lazy {
        println("lazy initialized") //6
        "KOtlin Programming"        //7 lazy반환
    }

    fun flow(){
        println("not initialized") //4
        println("subject one : $subject")   //5 최초 초기화시점
        println("subject two : $subject")   //8 이미 초기화된 값 사용

    }

}

fun main() {
    val test = LazyTest()       //1 호출
    test.flow()                 //3
}