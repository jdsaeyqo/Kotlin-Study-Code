package Day04.capsule.internal2

import Day04.capsule.internal.InternalTest

class OtherFile{
    fun test(){
        val it = InternalTest()
        it. i = 6
        it.internalFunc()
    }
}

fun main() {2
    val it = InternalTest()
    val of = OtherFile()
    of.test()
}