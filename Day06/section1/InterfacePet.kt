package Day06.section1

interface Pet{
    //인터페이스에서는 프로퍼티에 값을 저장할 수 없지만
    // val로 선언된 프로퍼티는 게터를 통해 필요 내용 구현 가능

    var category : String //abstract키워드가 없어고 기본은 추상 프로퍼티
    var species : String
    fun feeding()        //역시 추상메서드

    fun patting(){       //구현부 포함하면 일반메서드가 됨
        println("Keep patting")//구현부
    }

}
class Cat(name : String, override var category: String): Pet {
    override var species: String = "CAT"

    override fun feeding() {
        println("Feed the cat a tuna")
    }

}

fun main() {
    val obj = Cat("COco","small")
    println("Pet Category : ${obj.category}")
    obj.feeding()
    obj.patting()
}

