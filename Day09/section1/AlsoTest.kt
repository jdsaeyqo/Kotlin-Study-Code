package Day09.section1

fun main() {
   data class Person(var name:String, var skills : String)

    var person = Person("Kildong","Kotlin")

    val a = person.also {
        it.name="Sean"         //apply 사용하면 it.을 생략 가능
        it.skills = "Android"
//        "Success" //also는 마지막줄 반환 x
//                  //let은 마지막줄 반환
    }

    println("a = $a, person $person")

}