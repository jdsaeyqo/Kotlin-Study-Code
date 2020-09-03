package Day05.GetterSetter

class User(_id:Int, _name:String,_age:Int){

    val id:Int = _id
//        get() = field                 생략 가능

    var name:String = _name
//        get() = field
//        set(value){                   생략 가능
//            field = value
//        }

    var age:Int = _age
//    get() = field
    set(value) {
        field=value+10  // set의 내부를 변경할수 있음
    }
}

fun main() {
    val user1 = User(1,"Kildong",30)
    //user1.id = 2   에러! val 프로퍼티는 값 변경 불가
    user1.age = 35  //세터 작용
    println("user1.age = ${user1.age}")
}