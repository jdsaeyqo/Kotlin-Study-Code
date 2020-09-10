package Day09.section2


data class Person( //data 클래스는 프로퍼티 선언하면 getter setter자동 선언

    var name:String? = null,
    var age :Int? = null,
    var job : Job? = null

)

data class Job(
    var category : String? = null,
    var position:String? = null,
    var extension:Int? = null
)

//fun person(block:(Person) -> Unit): Person{
//    val p = Person()
//    block(p)
//    return p
//}
//val person = person{
//    it.name = "Kildong"
//    it.age = 40
//
//}
//it을 제거한 표현식을 사용하려면 람다식을 Person에서 받도록 확장 함수 형태로 변경

/*
fun person(block : Person.()->Unit):Person {
    val p = Person()
    p.block()
    return p
 */

fun main() {
    val person = person {
        name = "Kildong"        //this.name으로 접근하며 this는 생략 가능
        age = 40
        job {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }
}


//apply이용해서 코드 축약
fun person(block: Person.() -> Unit):Person = Person().apply(block)

fun Person.job(block:Job.() -> Unit){
    job = Job().apply(block)
}
