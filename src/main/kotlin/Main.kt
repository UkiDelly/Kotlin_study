fun main() {
	
	/**
	 *  [associateBy] - List내의 요소들을, 해당 요소의 속성들을 key로 만들어 Map으로 반환
	 *  [groupBy] - key가 같은 요소들을 배열로 묶어 Map으로 반환
	 *  [partition] - 조건에 따라 List를 2개로 나누어 Pair로 반환
	 *  [flatMap] - 요소마다 만들어진 컬렉션을 합쳐서 반환
	 *  [getOrElse] - index 위치에 아이템이 있으면 아이템을 반환하고, 아닌 경우 지정한 기본값을 반환
	 *  [zip] - 컬렉션 두개의 아이템을 1:1로 매칭하여 개 컬렉션을 만들어줌
	 */
	
	val personList = listOf(
		Person("유나", 1992),
		Person("조이", 1996),
		Person("츄", 1999),
		Person("유나", 2003)
	)
	
	
	println(personList.associateBy { it.birthYear })
	
	println(personList.groupBy { it.name })
	
	val (over98, under98) = personList.partition { it.birthYear > 1998 }
	println(over98)
	println(under98)
	
	
	// 	========================================================================
	
	val numbers = listOf(- 3, 7, 2, - 10, 1)
	
	println(numbers.flatMap { listOf(it * 10, it + 10) })
	
	println(numbers.getOrElse(1) { 50 })
	
	println(numbers.getOrElse(10) { 50 })
	
	val names = listOf("A", "B", "C", "D")
	
	print(names zip numbers)
	
}


data class Person(val name: String, val birthYear: Int)