package Day04.Inherit

open class Person
{
    constructor(firstname : String){
        println("Person firstname : $firstname")
    }
    constructor(firstname: String,age:Int){
        println("Person firstname : $firstname, $age")

    }

}
class Developer : Person
{
    constructor(firstname: String):this(firstname,10){
        println("Developer firstname : $firstname")
    }
    constructor(firstname: String,age: Int):super(firstname, age){
        println("Developer firstname : $firstname, $age")

    }
}

fun main() {
    val d1 = Developer("lee")


}