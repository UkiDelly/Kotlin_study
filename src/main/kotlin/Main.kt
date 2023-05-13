fun main() {
	
	/**
	 *  [Set] - 정렬되어 있지 않으며 중복을 허락하지 않는 Collection
	 *        - index으로 값을 참조할 수 없다.
	 *        - set.contains(element) : element가 set에 포함되어 있는지 확인
	 *        - setOf() : 불변형 Set을 생성
	 *        - mutableSetOf() : 가변형 Set을 생성
	 */
	val set = mutableSetOf<String>("귤", "바나나", "키워")
	
	for (item in set) {
		println(item)
	}
	
	set.add("자몽")
	println(set)
	
	set.remove("바나나")
	println(set)
	
	println(set.contains("귤"))
	
	
	/**
	 *  [Map] - Key와 Value의 쌍으로 이루어진 Collection
	 *        - map[key] = value : key에 value를 할당
	 *        - mapOf() : 불변형 Map을 생성
	 *        - mutableMapOf() : 가변형 Map을 생성
	 *        - put(key, value) : key에 value를 할당
	 *        - remove(key) : key에 해당하는 값을 제거
	 *        - Dart와는 달리 : 가 아닌 to를 사용한다.
	 */
	
	val map = mutableMapOf<String, String>(
		"레드벨벳" to "음파음파",
		"트와이스" to "FANCY",
		"ITZY" to "ICY"
	)
	
	
	for (entry in map) {
		println("${entry.key} : ${entry.value}")
	}
	
	
	// 추가
	map.put("오마이걸", "번지")
	println(map)
	
	// 제거
	map.remove("ITZY")
	println(map)
	
	
	// 값 참조
	println(map["레드벨벳"])
	
}