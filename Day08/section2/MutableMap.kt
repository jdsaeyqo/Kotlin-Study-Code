package Day08.section2

fun main() {
    //가변형 맵의 선언 및 초기화
    val capitalCityMap : MutableMap<String, String>
    = mutableMapOf("Korea" to "Seoul", "China" to "Beijing","Japan" to "Tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)
    capitalCityMap.put("UK","London")
    capitalCityMap.remove("China")
    println(capitalCityMap)
    println(capitalCityMap.toSortedMap()) //key를 오름차순 정렬

    val addData = mutableMapOf("USA" to "Washington","Italy" to "Rome")
    capitalCityMap.putAll(addData) // 모든 데이터 추가 가능. 키 중복되면 값이 덮어쓰기 됨
    println(capitalCityMap)

}