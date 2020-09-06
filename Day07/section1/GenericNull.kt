package Day07.section1

class GenericNull<T>{       //기본적으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(args1 : T, args2 : T){
        println(args1?.equals(args2))
    }
}

fun main() {
    val obj = GenericNull<String>()         //non-null로 선언됨
//    obj.EqualityFunc("Hello",null)//null이 허용되지 않음

    val obj2 = GenericNull<Int?>()          //null이 가능한 형식으로 선언
    obj2.EqualityFunc(null,10)  //null 사용 가능
}