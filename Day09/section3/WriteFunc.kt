package Day09.section3

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception

fun main() {
    val path = "C:\\Kot\\Test.txt"

    val text = "Hello World. 안녕하세요."

//    val file = File(path)
//    val printWriter = PrintWriter(file)
//
//    printWriter.write(text)
//    printWriter.flush()
//    printWriter.close()

    //위의 코드 축약 - append 역할
    File(path).printWriter().use { it.println(text) }


//    val writer = FileWriter(path, true)//인자: 경로, append여부
//    try {
//        writer.write(outString)
//    }catch (e:Exception){
//
//    }finally {
//        writer.close()
//    }
//}