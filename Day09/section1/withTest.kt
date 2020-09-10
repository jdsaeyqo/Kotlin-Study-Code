package Day09.section1

fun main() {
    data class User(val name:String, var skills : String, var email:String? = null)

    val user = User("Kildong","default")

    val result = with(user){
        skills = "Kotlin"
        email = "kildong@ex.com"
        "success"
    }
    println(user)
    println("result : $result")
}