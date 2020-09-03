package Day05.GetterSetter


//id는 var(가변)이므로 setter와 getter 둘다 생성되고
//name과 age는 val(불변)이므로 getter만 생성
class Person(var id:Int, val name:String, val age:Int)

fun main() {
    val person = Person(1,"Kildong",25)

    person.id = 2 //setter작용
     println(person.id) //getter작용
}

