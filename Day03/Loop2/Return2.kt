package Day03.Loop2

fun retFunc1(){
    println("start of retFunc")
    inlineLambda(13,3,fun (a,b){
        val result = a+b
        if (result > 10) return
        println("result: $result")
    })
    println("end of retFunc")

}
 val getMessage=fun(num:Int):String{
     if (num !in 1..100){
         return "ERROR"
     }
     return "Success"
 }