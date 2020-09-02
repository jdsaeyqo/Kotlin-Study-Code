package Day04.capsule.internal

internal class InternalTest{
    internal var i = 1
    internal fun internalFunc(){

    }
}

class Other{
   private val it = InternalTest()
    fun test(){
        it.i =3
        it.internalFunc()
    }
}

fun main() {
    val it = InternalTest()
    it.i=10
    it.internalFunc()
}