fun main() {
	
	// 반복문
	
	// List 생성 (Array 아님)
	val items = listOf(1, 2, 3, 4, 5)
	
	// for in 반복문
	for (item in items) {
		println(item)
	}
	
	// 	forEach 반복문
	items.forEach { item ->
		println(item)
	}
	
	// 	일반적인 for문
	for (i in 0..items.size)
		println(i)
}