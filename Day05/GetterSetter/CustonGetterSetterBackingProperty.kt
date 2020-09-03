package Day05.GetterSetter

import java.lang.AssertionError

class User2(_id : Int,_name:String,_age:Int){
    val id = _id

    private var tempName : String? =null

    var name = _name
        get(){
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }

    var age = _age
}

fun main() {
    val user1 = User2(1,"Kildong",35)
    user1.name = ""
    println("user1.name : ${user1.name}")
}