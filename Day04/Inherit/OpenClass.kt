package Day04.Inherit

open class Bird(var name:String,var wing : Int,var beak : String,var color :String)
{
    fun fly() = println("Fly wing : $wing")
   open fun sing(vol:Int) = println("Sing vol : $vol")

}

class Lark(name: String,wing: Int,beak: String,color: String) :Bird(name, wing, beak, color)
{   //final은 더이상 하위 클래스가 오버라이딩 금지. //override는 open메서드 오버라이딩하는 코드
     final override fun sing(vol: Int)
     { super.sing(vol) // 상위 sing을 먼저 수행후 아래 코드 실행
         println("Sing Sing vol : $vol")
    }
    fun singhitone() = println("Happy Song!")

}

class Crow(name: String,wing: Int,beak: String,color: String,var eyes:Int)
    :Bird(name, wing, beak, color)
{
    fun howl() = println("howl loudly")
}

class Parrot : Bird{
    var language : String

    constructor(name:String,wing : Int,beak : String,color :String,language:String)
    :super(name, wing, beak, color){
        this.language = language
    }
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("MyBird",2,"short","blue")
    val lark = Lark("myLark",2,"long","brown")
    val parrot = Parrot("Myparrot",2,"short","multiple","korean")
    val crow = Crow("myCrow",2,"long","black",2)


    lark.singhitone()
    parrot.speak()
    lark.fly()


    lark.sing(4)
    crow.howl()
}

