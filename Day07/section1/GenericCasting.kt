package Day07.section1

open class Parent

class Child:Parent()

class Cup<T>

fun main() {
//    val obj1:Child = Parent()   //하위클래스로부터 상위클래스 객체 생성 불가
    val obj2:Parent = Child()   //상위클래스로부터 하위클래스 객체 생성 가능

//    val obj3:Cup<Child> = Cup<Parent>()
//    val obj4:Cup<Parent> = Cup<Child>()     //형식 매개변수는 기본적으로 하위객체 생성 불가
    val obj5 = Cup<Child>()
    val obj6 : Cup<Child> = obj5    //형식 일치하므로 ok
}