package chap03.section3



fun main() {
// 매개변수가 없는 경우
    noParam { "Hello World!" }
    noParam ({"Hello World!" })

//매개변수가 한개인 경우
    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World! $it" }

//매개변수가 두개 이상인 경우
    moreParam{a,b -> "Hello World!   $a  $b"}

}

//매개변수 x
fun noParam(out:()-> String)= println(out())

//매개변수 1개
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

//매개변수 2개 이상
    fun moreParam(out:(String,String)->String){
    println(out("OneParam","TwoParam"))
}

