fun main() {
	
	// 	 List
	val a = listOf("사과", "배", "딸기", "포도")
	
	println(a[0])
	
	
	val b = mutableListOf(6, 3, 1)
	
	println(b)
	
	b.add(4)
	
	println(b)
	
	b.add(2, 8)
	
	println(b)
	
	b.removeAt(1)
	
	
	println(b)
	
	b.shuffle()
	println(b)
	
	b.sort()
	println(b)
}