package Day04.Inherit

open class A{
    open fun f() = println("A의 F")
    fun a()= println("A의 a")

}
interface B{
    fun f()= println("B의 F")
    fun b() = println("B의 b")

}

class C:A(),B
{
    override fun f() = println("C의 F")

    fun test(){
        f()
        b()
        a()
        A().f()
        super<B>.f()
    }

}

fun main() {
    val c1 = C()
    c1.test()

}