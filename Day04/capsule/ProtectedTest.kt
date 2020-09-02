package Day04.capsule

open class Base{//최상위 선언 클래스에는 protected를 사용할 수 없음
    protected var i = 1
    protected fun protectedFunc(){
            i+=1   //허용
    }

    fun access() {
        protectedFunc()     //접근 허용

    }
    protected class Nested //내부 클래스에는 지시자 허용

}

class Derived:Base(){

    var j = i+1 //protected이므로 상속받은 클래스는 변수사용가능
    fun derivedFunc():Int{
        protectedFunc()
        return i

    }
}
class Other{
    fun other(){
        val base = Base()
//        base.i = 3 분리된 클래스이므로 사용 불가
    }
}

fun main() {

    val base = Base()
//    base.i= 1             불가
//    base.protectedFunc()  불가
    base.access()

    val derived = Derived()
    derived.j = 3
    derived.derivedFunc()
}