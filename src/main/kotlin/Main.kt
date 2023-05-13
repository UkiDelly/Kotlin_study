fun main() {
	
	/**
	 *  [forEach] - collection내의 모든 요소에 대해 동일한 작업을 수행할 때 사용
	 *  [filter] - collection내의 요소 중 특정 조건을 만족하는 요소만을 추출하여 반환할때 사용
	 *  [map] - collection내의 각각 요소에 대해 동일한 작업을 수행하고, 그 결과를 새로운 collection으로 반환할 때 사용
	 *  [any] - collection내의 요소 중 특정 조건을 만족하는 요소가 하나라도 존재하는지 여부를 반환할 때 사용
	 *  [all] - collection내의 모든 요소가 특정 조건을 만족하는지 여부를 반환할 때 사용
	 *  [none] - collection내의 요소 중 특정 조건을 만족하는 요소가 하나도 존재하지 않는지 여부를 반환할 때 사용
	 *  [first] - collection내의 첫번째 요소를 반환할 때 사용, 람다 함수 안에 특정 조건을 추가하면 조건을 만족하는 첫번째 요소를 반환
	 *  [firstOrNull] - first를 대체하여 사용 가능, 조건을 만족하는 요소가 없을 경우 null을 반환
	 *  [last] - collection내의 마지막 요소를 반환할 때 사용, 람다 함수 안에 특정 조건을 추가하면 조건을 만족하는 마지막 요소를 반환
	 *  [lastOrNull] - last를 대체하여 사용 가능, 조건을 만족하는 요소가 없을 경우 null을 반환
	 *  [find] - first를 대체하여 사용 가능
	 *  [findLast] - last를 대체하여 사용 가능
	 *  [count] - collection내의 요소의 개수 반환, 람다 함수내에 특정 조건을 걸 경우, 조건을 만족하는 요소의 개수를 반환할 때 사용
	 */
	
	val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")
	
	nameList.forEach { print(it + ", ") }
	println()
	
	println(nameList.filter { it.startsWith("김") })
	
	println(nameList.map { "이름 : $it" })
	
	println(nameList.any { it == "김지연" })
	
	println(nameList.all { it.length == 3 })
	
	println(nameList.none { it.startsWith("이") })
	
	println(nameList.first { it.startsWith("김") })
	
	println(nameList.last { it.startsWith("김") })
	
	println(nameList.count { it.contains("지") })
	
	
}