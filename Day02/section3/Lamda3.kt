package chap03.section3

import com.sun.javafx.scene.control.behavior.TwoLevelFocusBehavior

fun main() {

    //  인자와 함께 사용하는 경우
    withArgs("Args1","Args2",{a,b-> "Hello World!   $a   $b  "})
    // withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Args1","Args2"){a,b-> "Hello World!   $a   $b"}

    twoLambda({a,b-> "First  $a  $b"},{"Second $it "})
    twoLambda({a,b-> "First  $a  $b"}) {"Second $it "}
}

fun withArgs(a: String,b:String,out:(String,String)->String) {
    println(out(a, b))
}

fun twoLambda(first : (String, String)-> String, second : (String)->String){
        println(first("OneParam","TwoParam"))
        println(second("OneParam"))
    }
