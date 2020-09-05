package Day06.section1

abstract class Vehicle(val name:String, val color:String,val weight:Double){
    //추상 프로퍼티 - 하위클래스에서 오버라이딩
    abstract val maxSpeed : Double

    var year : String = "2008"

    //추상 메서드
   abstract fun start()

   abstract fun stop()

    //비추상 메서드
    fun displaySpec(){
        println("name : $name, color: $color, weight : $weight,year:$year,maxSpeed : $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override val maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

}
fun _autoPilotOn(){
    println("Auto Pilot On")
}
class MotorBike(name: String, color: String, weight: Double, override val maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("MotorBike Started")
    }

    override fun stop() {
        println("MotorBike Stopped")
    }

}

fun main() {
    var c1 = Car("Matiz", "Red", 1000.0, 100.0)
    //추상클래스로부터 객체 생성 불가
//    var v1= Vehicle("Matiz","red",1000.0)

    var m1 = MotorBike("Motor1", "blue", 1000.0, 100.0)

    c1.year = "2014"
    c1.displaySpec()

    m1.displaySpec()
    c1.start()
    m1.stop()
}


