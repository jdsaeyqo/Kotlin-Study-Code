package Day07.section1

class Calc<T:Number>{       //클래스의 형식 매개변수 제한
    fun plus(arg1:T,arg2:T):Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {
    val calc = Calc<Int>()
    println(calc.plus(10,20))

    val calc1 = Calc<Double>()
    val calc2 = Calc<Long>()
//    val calc3 = Calc<String>()      // 제한된 자료형이 Number라 String 불가

    println(calc1.plus(2.5,4.5))
    println(calc2.plus(3L,5L))


}