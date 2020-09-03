package Day05.GetterSetter

class User1(_id : Int,_name:String,_age:Int){
    val id = _id
    var name = _name
        set(value){
            println("The name was changed")
            field= value.toUpperCase()
        }

    var age = _age
}

fun main() {
    val user1 = User1(1,"Kildong",35)
    user1.name = "coco"
    println("user1.name : ${user1.name}")
}