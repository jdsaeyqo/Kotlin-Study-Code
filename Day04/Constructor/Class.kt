package Day04.Constructor

class Bird{

    var name= "MyBird"
    val wing = 2
    var beak = "short"
    var color= "blue"

    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol :  $vol")
}

fun main() {
    val coco = Bird()
    coco.name = "coco"
    coco.color = "Yellow"

    println(coco.name)
    println("coco.color = ${coco.color}")

    coco.fly()
    coco.sing(5)
}