package Day03.Loop2

fun main() {
    for(i in 1..5){
        if(i==3) break
        println(i)
    }
    println()
    println("Outside")

    labelBreak()
    labelBreak1()
}

fun labelBreak(){
    println("LabelBreak")
    for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i : $i, j : $j")
        }
    }
}fun labelBreak1(){
    println("LabelBreak")
    first@for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i : $i, j : $j")
        }
    }
}