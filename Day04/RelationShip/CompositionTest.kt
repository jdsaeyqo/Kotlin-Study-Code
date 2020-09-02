package Day04.RelationShip

//구성관계

class Car(val name : String, val power:String){
    private var engine = Engine(power)  //Engine클래스 객체는 Car에 의존적

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()

}

class Engine(power:String){
    fun start() = println("Engine has been started")
    fun stop() = println("Engine has been stopped")
}

fun main() {
    val car = Car("tico","100HP") //Car객체 생성시 Engine객체도 구성되어 호출됨
    car.startEngine()
    car.stopEngine()
}
