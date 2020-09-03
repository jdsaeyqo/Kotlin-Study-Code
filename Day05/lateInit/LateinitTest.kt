package Day05.lateInit

class Person{
    lateinit var name:String     //늦은 초기화

    fun test(){
        if(!::name.isInitialized){    //프로퍼티의 초기화 여부 판단
            println("not initialized")

        }else{
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.name = "Kildong" //이 시점에서 초기화
    kildong.test()
    println("name : ${kildong.name}")
}