package Day09.section1

fun main() {
    data class Person(var name:String,var skills : String)

    var person = Person("Kildong","Kotlin")

    //여기서 this는 person 객체를 가리킴
    person.apply { this.skills="Swift"}
    println(person)

    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"
    }
    println(person)
    println(returnObj)
}