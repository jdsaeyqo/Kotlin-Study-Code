package Day06.section2

data class Customer(var name:String, var email:String) {  //프로퍼티에 기본값 넣을 수 있음.

    var job:String = "Unknown"
    constructor(name: String,email: String,_job:String) : this(name, email){
        this.job = _job
    }

    init{
        this.name = "Mr/Ms "+this.name
    }
}

fun main() {
    val cus1 = Customer("Kildong","kildong@mail.com")
    println(cus1)
    println("name = ${cus1.name}, email = ${cus1.email}")

    val n1 = cus1.component1()  //프로퍼티 요소
    val n2 = cus1.component2()
    println("name = $n1, email = $n2")

    val lam1 = {
        (name,email):Customer ->
        println(name)
        println(email)
    }

    lam1(cus1)

}