package Day06.section1

open class Animal(val name:String)

class Dog(name: String, override var category:String): Animal(name), Pet {

    override var species: String = "DOG"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master{
    fun playwithPet(pet: Pet){
        println("Enjoy with my ${pet.species}")
    }
}
fun main() {
    val master = Master()
    val dog = Dog("Toto","small")
    val cat = Cat("Coco","BigFat")
    master.playwithPet(dog)
    master.playwithPet(cat)

}