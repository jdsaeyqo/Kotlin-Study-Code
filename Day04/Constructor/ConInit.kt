package Day04.Constructor

class Bird4(var name:String="NONAME",var wing:Int=2,var beak:String,var color:String)
{
    init {
        println("초기화 블록 시작")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("초기화 블록 끝")
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")

}

fun main() {
    var coco = Bird4(beak = "short",color = "Yellow")

}