package Day04.Constructor.private

private class PrivateClass {        //private 클래스는 내부에서만 사용 가능
    private var i = 1
    private  fun privateFunc(){
        i +=1
        println(i)
    }

    fun access(){
        privateFunc()   //접근 허용 퍼블릭 함수안에 privateFunc를 사용해 access 통해 접근
    }
}

class OtherClass {
//    val opc = PrivateClass() 불가 프로퍼티opc는 private되야 함.
    fun test(){
        val pc = PrivateClass()

    pc.access()
    }
}

fun main(){  //Toplevel 메서드에서는 private클래스 호출 가능
    val pc = PrivateClass()
//    pc.i 접근 불가
//    pc.privateFunc() 접근 불가
    pc.access()

}
fun TopFunction(){
    val tpc = PrivateClass() // 생성 가능
}