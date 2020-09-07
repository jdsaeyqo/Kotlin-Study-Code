package Day08.section2


//HashSet은 결과와 같이 입력 순서와 중복된 요소는 무시
fun main() {
    val intsHashSet : HashSet<Int> = hashSetOf(6,3,4,7) //불변성 기능이 없음
    intsHashSet.add(5)
    intsHashSet.remove(6)
    println(intsHashSet)
    
    //정렬 기능은 없지만 해시값을 통해 요소를 찾아내므로 시간 빠름
    //요청과 즉시 바로 찾아냄
}