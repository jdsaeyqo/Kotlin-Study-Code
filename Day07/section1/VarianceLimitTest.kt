package Day07.section1

import sun.security.provider.ConfigFile

open class Animal(val size : Int)

class Cat(val jump : Int):Animal(50)

class Spider(val poison : Boolean):Animal(1)

class Box1<out T: Animal>(val element:T){
    fun getAnimal(): T = element
//    fun setAnimal(new:T){   //out T 는 반환형태만 사용 가능, 입력으로는 불가
//                            //in T  는 입력형태만 사용 가능, 반환으로는 불가
//        element = new
    }


fun main() {
    val c1 = Cat(10)         //상위 클래스에서 하위 클래스 객체 생성 가능  val c1:Animal = Cat(10)
    val s1= Spider(true)

    var a1 :Animal = c1         //이런 식으로 캐스팅 가능
    a1= s1
    println("s1 ${a1.size} ${a1.poison}")

    val b1 = Box1<Animal>(Cat(4))
    val b6 = Box1<Animal>(Spider(true))
    val b2:Box1<Animal> = Box1<Cat>(Cat(3))      // 무변성일 경우 상하관계 성립 안됨
                                            // 공변성(out)일 경우 상위->하위 가능
    val b3 = Box1<Spider>(Spider(false))
//  val b4 : Box1<Number> = Box1<Int>()   // 공변성(out)일 경우 상위->하위 가능, T:Animal로 제한되면 다른 타입 사용 불가


}