package Day04.Inherit

open class Base(){
    open val x : Int = 1
    open fun f() = println("Base f")
}

class Child() : Base(){
    fun b() = println("b")

    override val x: Int = super.x+5

    override fun f() {
        println("child f")

    }

    inner class In{
        fun f() = println("in f")
        fun test(){
            f()     //현재 이너클래스의 f()접근
            Child().f() //바로 바깥클래스 f()접근
            super@Child.f() //Child의 상위 클래스인 Base 클래스의 f()접근
            println("[inside] super@Child.x: ${super@Child.x}")
            println("[inside] Child.x: ${Child().x}")
        }
    }

}

fun main() {
    val c1 = Child()

    c1.In().test()
}