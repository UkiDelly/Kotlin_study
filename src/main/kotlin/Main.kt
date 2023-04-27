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
	
	// 단계 지정
	for (i in 0..10 step 2)
		println(i)
	
	// 역방향
	for (i in 10 downTo 0)
		println(i)
	
	// 범위 지정 0..10 와 같은것으로 생각됨
	for (i in 0 until 10)
		println(i)
	
	// 다중 for문에서 for문 특정
	loop@ for (i in 1..100) {
		for (j in 1..100) {
			if (i == 10 && j == 10) {
				
				// @loop 라벨을 지정한 for문을 종료
				break@loop
			}
		}
	}
}