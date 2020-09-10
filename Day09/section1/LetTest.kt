package Day09.section1

fun main() {
    var score:Int? = 32
    score = null

    fun checkScore(){
        if ( score != null){
            println("score = $score")
        }
    }

   fun checkScoreLet(){
       score?.let { println("score = $it") }
       //? 세이프콜 사용하여 null이 아닐때만 처리하게 함
       val str = score?.let { it.toString() }
       println(str) // 세이프콜로 let 이하 실행 안되지만 str에 null값이 저장은 됨

   }

checkScore()
checkScoreLet()
}