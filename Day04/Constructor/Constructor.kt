package Day04.Constructor

class Bird1{

    var name:String
    var wing :Int
    var beak :String
    var color:String

     constructor(name: String, wing:Int, beak:String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = "Red"
    }
    constructor(name:String, beak: String){
        this.name = name
        this.wing = 2
        this.beak = beak
        this.color = "Grey"
    }
        fun fly() = println("Fly wing : $wing")
        fun sing(vol: Int) = println("Sing vol : $vol")

}

fun main() {
    val coco = Bird1("MyBird",3,"long")

    println(coco.name)
    println(coco.wing)
    println(coco.beak)
    println(coco.color)
    coco.fly()
    coco.sing(3)

    val kaka = Bird1("kaka","long")
    println(kaka.name)
    println(kaka.wing)
    println(kaka.beak)
    println(kaka.color)
    kaka.fly()
    kaka.sing(4)

    val coco2 = Bird1("coco2",4,"long")
    println(coco2.color)


}